public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        int x = 3;
        System.out.println("x = " + x);

        double y = 4.32;
        System.out.println("y = " + y);

        float z = (float)5.4;

        int x2 = 5;
        System.out.println("x + x2 = " + (x + x2)); // ?

        final long t = 7097797437823243782l;
//        t++;

//        short a = 32768;
//        System.out.println("a = " + a);

        x = 5;
        System.out.println(x++); // 5
        System.out.println(++x); // 7

        String str = "Hello, world!";
        System.out.println("The string is: " + str );
        System.out.println("The length of the string is: " + str.length());

        System.out.println(x % 2 == 0 ? "x e divizibil cu 2" : "x nu e divizibil cu 2");

        for (int i = 0; i < 6; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("Showing messange number " + i);
            if (i == 3) {
                break;
            }
        }

//        for (;;) {
//            System.out.println("Something");
//        }

//        System.out.printf("Numarul x este: %5d, iar z este: %4.3f, iar x ca long este: %10l", x, z, x);

    }

}
