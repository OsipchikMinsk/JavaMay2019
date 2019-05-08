package Block1;

/*
* Написать программу, которая переворачивает (реверсирует) семизначное
число N (к примеру, число 1234567 реверсируется в число 7654321).*/

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input seven digit number");
        int start = scanner.nextInt();
        int reverse = start % 10 * 1000000 + start % 100 / 10 * 100000 + start % 1000 / 100 * 10000 + start % 10000 / 1000 * 1000 +
                start % 100000 / 10000 * 100 + start % 1000000 / 100000 * 10 + start / 1000000;
        System.out.println("start => " + start);
        System.out.println("reverse=> " + reverse);
        scanner.close();
    }
}
