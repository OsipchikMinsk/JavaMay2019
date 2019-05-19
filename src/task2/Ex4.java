package task2;
/*
* Дру́жественные чи́сла — два различных натуральных числа , для которых
сумма всех собственных делителей первого числа равна второму числу и
наоборот, сумма всех собственных делителей второго числа равна первому
числу. Дружественные числа были открыты последователями Пифагора ,
которые, однако, знали только одну пару дружественных чисел – 220 и 284.
Найдите все дружественные числа в заданном диапазоне.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {
    private static int sumOfAllDdivisiors(int number) {
        int summOfDivisiors = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                summOfDivisiors = summOfDivisiors + i;
            }
        }

        return summOfDivisiors;
    }


    public static int countFriendlyNumbers(int a, int b) {
        int countFriendlyNumber = 0;
        for (int i = a; i < b; i++) {
            int tempA = sumOfAllDdivisiors(i);
            if (tempA < b && sumOfAllDdivisiors(tempA) == i && tempA != i) {
                System.out.print(i+"\t");
                countFriendlyNumber++;
            }

        }
        return countFriendlyNumber;


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Enter two natural number");
        try {
            number1 = scanner.nextInt();
            number2 = scanner.nextInt();
            System.out.println("Friendly number of: " + number1 + " & " +number2);
            System.out.println("\nTotal friendly number: " + countFriendlyNumbers(number1, number2));

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
