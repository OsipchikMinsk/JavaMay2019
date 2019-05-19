package block1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
* Масса динозавра задаётся в килограммах. Разработайте программу, которая
вычисляет, сколько это миллиграмм, грамм и тонн.*/

public class Ex2 {

    static long calculateInMg(int m) {
        return m * 1_000_000;
    }

    static int calculateInGr(int m) {
        return m * 1000;
    }

    static double calculateInTonn(int m) {
        return (double) m * 0.001;
    }


    public static void main(String[] args) {
        int m;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input weight of dino");

        try {
            m = scanner.nextInt();

            long mInMg = calculateInMg(m);
            int mInGr = calculateInGr(m);
            double mInTonn = calculateInTonn(m);

            System.out.println("Weight of dino in milligrams  = " + mInMg);
            System.out.println("Weight of dino in killigrams = " + m);
            System.out.println("Weight of dino in grams  = " + mInGr);
            System.out.println("Weight of dino in tonn  = " + mInTonn);

        } catch (InputMismatchException e) {
            System.out.println("Wrong number");
        }
        scanner.close();
    }
}
