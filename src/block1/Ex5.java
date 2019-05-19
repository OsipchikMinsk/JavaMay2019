package block1;
/*
* Написать программу, которая находит арифметическое и геометрическое
среднее цифр шестизначного числа N.*/

import java.util.Scanner;

public class Ex5 {

   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите шестизначное число");
        int a = scanner.nextInt();
        scanner.close();
        int[] number = new int[6];
        for (int i = 1; i <= 6; i++) {
            number[number.length - i] = a % 10;
            a /= 10;

        }
        double arifmeticMidle = 0;
        double geometricMidle = 1;

        for (int i = 0; i <= number.length - 1; i++) {
            arifmeticMidle = arifmeticMidle + number[i];
            geometricMidle = geometricMidle * number[i];
        }
        System.out.println(arifmeticMidle + "      " + geometricMidle);

        arifmeticMidle = arifmeticMidle / number.length;
        double sroot = 1.0d / number.length;
        geometricMidle = Math.pow(geometricMidle, sroot);

        System.out.println("Арифметичесское среднее = " + arifmeticMidle);
        System.out.println("Геометрическое среднее = " + geometricMidle);
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input six digit number");
        int a = scanner.nextInt();
        int digit0 = a / 100000; //first digit of number from left
        int digit1 = (a / 10000) % 10; //second digit of number from left
        int digit2 = (a / 1000) % 10; //third digit of number from left
        int digit3 = (a / 100) % 10; //fourth digit of number from left
        int digit4 = (a / 10) % 10; //fifth digit of number from left
        int digit5 = a % 10; //six digit of number from left

        /*System.out.println(digit0);
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);
*/
        double arithmeticMiddle = (double) (digit0 + digit1 + digit2 + digit3 + digit4 + digit5) / 6;
        double multiplication = digit0 * digit1 * digit2 * digit3 * digit4 * digit5;
        //System.out.println(g);
        double geometryMiddle = Math.pow(multiplication, 1.0d / 6);
        System.out.println("ArithmeticMiddle= " + arithmeticMiddle);
        System.out.println("GeometryMiddle = " + geometryMiddle);
        scanner.close();
    }

}
