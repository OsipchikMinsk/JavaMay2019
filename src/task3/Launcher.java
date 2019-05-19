package task3;


import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {

        ArrayWorker arrayWorker = new ArrayWorker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of Matrix N:M.  Number must be > 0!!!");

        int n = 0;
        int m = 0;
        while ((m <= 0) && (n <= 0)) {   //вводит число, пока оно не будет >0
            System.out.println("Enter Width > 0 ");
            m = scanner.nextInt();
            while (m <= 0) {
                System.out.println("Tray again");
                m = scanner.nextInt();
            }
            System.out.println("Enter Height > 0 ");
            n = scanner.nextInt();
            while (n <= 0) {
            System.out.println("Tray again");
            n = scanner.nextInt();
        }
    }
        int[][] arrayRandom = new int[m][n];

        arrayWorker.setRandomElementInMatrix(arrayRandom, 10, 50);
        arrayWorker.printMatrix(arrayRandom);
        System.out.println("Max element:" + arrayWorker.getMaxElement(arrayRandom));
        System.out.println("Min element:" + arrayWorker.getMinElement(arrayRandom));
        System.out.println("Arithmetic Middle:" + arrayWorker.getArithmeticMiddle(arrayRandom));
        System.out.println("Geometric Middle:" + arrayWorker.getGeometricMiddle(arrayRandom));
        System.out.println(arrayWorker.getIndexOfLocalMinimumInMatrix(arrayRandom));
        System.out.println(arrayWorker.getIndexOfLocalMaximumInArray(arrayRandom));
        arrayWorker.transposeMatrix(arrayRandom);
        System.out.println();
        int[][] myArray = {{2, 2, 2, 2, -10,11},
                           {2, 2, 42, 2, 1, 1},
                           {2, 2, 1, 2, 2, 36}};
        arrayWorker.printMatrix(myArray);
        System.out.println("Max element:" + arrayWorker.getMaxElement(myArray));
        System.out.println("Min element:" + arrayWorker.getMinElement(myArray));
        System.out.println("Arithmetic:" + arrayWorker.getArithmeticMiddle(myArray));
        System.out.println("Geometric Middle:" + arrayWorker.getGeometricMiddle(myArray));
        System.out.println(arrayWorker.getIndexOfLocalMinimumInMatrix(myArray));
        System.out.println(arrayWorker.getIndexOfLocalMaximumInArray(myArray));
        arrayWorker.transposeMatrix(myArray);

    }
}
