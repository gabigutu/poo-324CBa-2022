import catalog.Student;

public class Main {

    public static void main(String[] args) {
	    int x[] = new int[10];
	    int y = 4;

	    Student student = new Student(); // instantiere
//		student.media = 5.3f;
		student.setMedia(5.3f);
		student.setMedia(student.getMedia() + 1);
		student.afiseazaStudent();
//		System.out.println("Avem " + catalog.Student.nrStudenti);
//		student.afiseazaNumarStudenti();
		Student.afiseazaNumarStudenti();

		Student student1 = new Student("Vasile", 6.4f);
		student1.afiseazaStudent();
//		System.out.println("Avem " + catalog.Student.nrStudenti);
//		student1.afiseazaNumarStudenti();
		Student.afiseazaNumarStudenti();
		System.out.println(student1.getNume());

		int a = 7;
		student.setMedia(a);

		float myMedia = Float.parseFloat("9.444423");
		System.out.println("Media " + myMedia);

		Float myFloat = new Float("8.222");
		double myDouble = myFloat.doubleValue();
		System.out.println("Media: " + myDouble);

		int[] myInts = new int[10];
		Student[] studenti = new Student[10];
		studenti[3] = new Student("Gigel", 3.2f);


    }
}
