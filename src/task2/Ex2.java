package task2;

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
            System.out.print("Divisions of number " + number + " => ");
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

        int countOfDifferentNumbers = 0;
        int divisiorA;
        int one =0;
        int two =0;
        int three =0;
        int four =0;
        int five =0;
        int six =0;
        int seven =0;
        int eight =0;
        int nine =0;
        int zero =0;


        while (a > 0) {
            divisiorA = a % 10;
            a /= 10;

            switch (divisiorA) {
                case 1:
                    one++;
                    break;
                case 2:
                    two++;
                    break;
                case 3:
                    three++;
                    break;
                case 4:
                    four++;
                    break;
                case 5:
                    five++;
                    break;
                case 6:
                    six++;
                    break;
                case 7:
                    seven++;
                    break;
                case 8:
                    eight++;
                    break;
                case 9:
                    nine++;
                    break;
                case 0:
                    zero++;
                    break;
            }
        }
            if (one>1){
                one = 1;
            }
            if (two >1){
                two = 1;
            }
            if (three >1){
                three = 1;
            }
            if (four >1){
                four = 1;
            }
            if (five >1){
                five = 1;
            }
            if (six >1){
                six = 1;
            }
            if (seven > 1) {
                seven = 1;
            }
            if (eight > 1) {
                eight = 1;
            }
            if (nine > 1) {
                nine = 1;
            }
            if (zero > 1) {
                zero = 1;
            }
            countOfDifferentNumbers = one + two + three + four +five + six + seven + eight + nine + zero;

        return countOfDifferentNumbers;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1;
        int a;
        int b;
        System.out.println("Enter natural number");
        try {
            number1 = scanner.nextInt();
            System.out.println("1=> Greatest number=" + greatestNumber(number1) + " in your number:" + number1); //task 1
            System.out.printf("2=> Number %d" + isNumberPalindrome(number1), number1); //task2
            System.out.printf("3=> Is number %d  Prime=>" + isPrimeNumber(number1), number1); //task3
            findAllDivisors(number1);// task4
            System.out.println();
            System.out.println("5=>  Different  number of " + number1+ " " + differentNumbers(number1)); // task5


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