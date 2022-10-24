import java.util.Scanner;

public class Main {

    /**
     * This is the main method
     * @param args Receives arguments from command line
     */
    public static void main(String[] args) {
        String str;

        int x[] = new int[10]; // referinta
        if (x == null) {
            System.err.println("Could not allocate");
            System.exit(-1);
        }
        System.out.println("x = " + x);

        int noElements = 0;
        x[0] = 1; noElements++;
        x[1] = 9; noElements++;
        for (int i = 0; i < x.length; i++) {
//            System.out.print(x[i] + ' ');
            System.out.print(x[i] + " ");
        }
        System.out.println();

        int[] y;
        double[] a1, a2;
        double a3[], a4;
        a1 = new double[3];
        a2 = new double[3];
        a3 = new double[3];
//        a4 = new double[3];

        Scanner scanner = new Scanner(System.in);
        float[][] myValues = new float[3][6];
        for (int i = 0; i < myValues.length; i++) {
            for (int j = 0; j < myValues[i].length; j++) {
                myValues[i][j] = (float)Math.random();
//                System.out.print("myValues[" + i + "][" + j + "]= ");
//                myValues[i][j] = scanner.nextFloat();
            }
        }

        for (int i = 0; i < myValues.length; i++) {
            for (int j = 0; j < myValues[i].length; j++) {
                System.out.print(myValues[i][j] + " ");
            }
            System.out.println();
        }

        float[][] myValues2 = myValues; // copiere referinta
//        myValues2[0][0] = -1;

        for (int i = 0; i < myValues.length; i++) {
            for (int j = 0; j < myValues[i].length; j++) {
                System.out.print(myValues[i][j] + " ");
            }
            System.out.println();
        }

        myValues2 = new float[3][6];
        for (int i = 0; i < myValues.length; i++) {
            for (int j = 0; j < myValues[i].length; j++) {
                myValues2[i][j] = myValues[i][j];
            }
        }
        myValues2[0][0] = -1;

        System.out.println("MyValues after change");
        for (int i = 0; i < myValues.length; i++) {
            for (int j = 0; j < myValues[i].length; j++) {
                System.out.print(myValues[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("MyValues2 after change");
        for (int i = 0; i < myValues2.length; i++) {
            for (int j = 0; j < myValues2[i].length; j++) {
                System.out.print(myValues2[i][j] + " ");
            }
            System.out.println();
        }

        float[][] myValues3 = new float[3][6];
//        System.arraycopy(myValues, 0, myValues3, 0, myValues.length);
        for (int i = 0; i < myValues3.length; i++) {
            System.arraycopy(myValues[i], 0, myValues3[i], 0, myValues[i].length);
        }

        myValues3[0][0] = -5;
        System.out.println("MyValues3: ");
        for (int i = 0; i < myValues3.length; i++) {
            for (int j = 0; j < myValues3[i].length; j++) {
                System.out.print(myValues3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("MyValues after second change");
        for (int i = 0; i < myValues.length; i++) {
            for (int j = 0; j < myValues[i].length; j++) {
                System.out.print(myValues[i][j] + " ");
            }
            System.out.println();
        }

    }

    /**
     * Return the truth value
     * @param truthValue True or false
     * @return The calculated value
     */
    public static boolean isItTrue(boolean truthValue) {
        return truthValue;
    }

}
