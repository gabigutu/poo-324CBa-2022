public class Hello {

    public String name = "Vasile";

    public Hello() {
        System.out.println("Hello constructor");
    }

    public static void otherMethod() {
//        Greeter greeter = new Greeter(); // Greeter is only defined in main and nonStaticMethod
    }

    public static void main(String[] args) {
        int x;
//        System.out.println("Name is " + name); // same error as below

        class Greeter {
            public void sayHello() {
//                System.out.println("Hello from Greeter, " + name + "!"); // name is not static
            }
        }

        Greeter greeter = new Greeter();
        greeter.sayHello();

        Hello hello = new Hello();
        hello.nonStaticMethod();
    }

    public void nonStaticMethod() {
        int x = 4;

        class Greeter {
            public void sayHello() {
                System.out.println("Hello from Greeter, " + name + " x = " + x + "!");
            }
        }

        Greeter greeter = new Greeter();
        greeter.sayHello();

    }

}
