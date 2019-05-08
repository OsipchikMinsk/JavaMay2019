package Block1;
/*
* Разработайте небольшую цельную программу, которая меняет местами
содержимое двух целочисленных переменных a и b, не используя для этого
дополнительных переменных.*/

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first;
        int second;
        System.out.println("Input two different numbers ");
        first = scanner.nextInt();
        second = scanner.nextInt();
        System.out.println("number one =" + first + " number two = " + second);
        if (first != second) {
            second = first + second;
            first = second - first;
            second = second - first;
            System.out.println("number one =" + first + " number two = " + second);

        } else {
            System.out.println("!!! Numbers are equals");
        }
        scanner.close();
    }
}

