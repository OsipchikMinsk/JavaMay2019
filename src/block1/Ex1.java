package block1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {

    /*Разработайте программу, которая проверяет, что числа a, b и c различны
(одинаковы).*/


    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three number");

        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

            if (a == b && a == c) {
                System.out.println("Three number are equals " + a + "=" + b + "=" + c);
            } else if (a == b || a == c || b == c) {
                System.out.println("Equals");
            } else {
                System.out.println("Not equals");
            }

        } catch (InputMismatchException e) {
            System.out.println("Not a number");

        }
        scanner.close();
    }

}





