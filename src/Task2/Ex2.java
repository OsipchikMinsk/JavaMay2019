package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    /*
    * Разработать наиболее эффективные алгоритмы и написать код для решения
следующих задач:
1 найти наибольшую цифру натурального числа;
2 проверить, является ли заданное натуральное число палиндромом;
3 определить является ли заданное натуральное число простым;
4 найти все простые делители заданного натурального числа;
5 найти количество различных цифр у заданного натурального числа.
6 найти НОД и НОК двух натуральных чисел a и b.
*/

    private static int greatestNumber(int number) { //task1
        int maxNumber = 0;
        while (number > 0) {
            if (number % 10 > maxNumber) {
                maxNumber = number % 10;
                number /= 10;
            } else {
                number /= 10;
            }
        }
        return maxNumber;
    }

    private static String isNumberPalindrome(int number) { //task2
        int div = 0;
        int reversNumber = 0;
        int inputNumber = number;
        while (number != 0) {
            div = number % 10;
            reversNumber = reversNumber * 10 + div;
            number /= 10;
        }
        if (inputNumber == reversNumber) {
            return " palindrome";
        } else {
            return " not a palindrome ";
        }
    }

    private static boolean isPrimeNumber(int number) { //task 3
        boolean prime = true;
        for (int i = 2; i < Math.sqrt(number) + 1; i++) { //проверяем в диапозоне от 2 и до корня из числа. Сымый короткий путь
            if (number % i == 0) {
                System.out.println();
                System.out.print("Find divisor " + i + " ");
                prime = false;//  if we have divisor => number is composite
                break;
            }
        }
        if (prime == true) {
            return true;
        } else return false;
    }

    private static void findAllDivisors(int number) { //task4
        if (isPrimeNumber(number)) {
            System.out.println("1 " + number);
        } else {
            System.out.print("Divisions of number " + number + "=>");
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + "\t");
                }
            }
        }

    }

    private static int nOD(int a, int b) { //task 6
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return Math.abs(a);
    }

    private static int nOk(int a, int b) { //task 6
        return a / nOD(a, b) * b;
    }


    private static int differentNumbers(int a) { //task5

        int count = 0;
        int divisiorA;
        int divisiorB;
        divisiorA = a % 10;
        a /= 10;
        while (a > 0) {
            divisiorB = a % 10;
            a /= 10;
            if (divisiorA != divisiorB) {
                count++;
            }
        }
         if (count > 0) { //делаю проверку потому что ноль
            count++;
            return count;
        } return count;
    }




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1;
        int a;
        int b;
        System.out.println("Enter natural number");
        try {
            number1 = scanner.nextInt();
            System.out.println("Greatest number=" + greatestNumber(number1) + " in your number:" + number1); //task 1
            System.out.printf("Number %d" + isNumberPalindrome(number1), number1); //task2
            System.out.printf("Is number %d  Prime=>" + isPrimeNumber(number1), number1); //task3
            findAllDivisors(number1);// task4
            System.out.println(differentNumbers(number1)); //


            System.out.println("Input two numbers ");//task 6
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.printf("NOD of number %d&%d\t" + nOD(Math.abs(a), Math.abs(b)) + "\n", a, b); //task6
            System.out.printf("NOK of number %d&%d\t" + nOk(Math.abs(a), Math.abs(b)), a, b); //task6


        } catch (InputMismatchException e) {
            System.out.print("Only numbers are allowed. Please check your input. ");
            e.printStackTrace();
            System.exit(1);
        } catch (RuntimeException e) {
            System.out.print("Program is terminated because: ");
            e.printStackTrace();
            System.exit(1);
        }







    }
}