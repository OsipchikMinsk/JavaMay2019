package Task2;
/*
* Натуральное число называют совершенным, если оно равно сумме всех своих
делителей, не считая только его самого (например, 28=1+2+3+7+14 –
совершенное число). Напишите программу, которая проверяет, является ли
введённое натуральное число совершенным. Для проверки работоспособности
программы приводится список некоторых совершенных чисел: 6, 28, 496, 8128.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {

    private static boolean numberIsPerfect(int number) { //task4
        int summOfdivisiors = 0;
        boolean isPerfect = false;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                summOfdivisiors = summOfdivisiors + i;
            }
        }
        if (summOfdivisiors == number) {
            isPerfect = true;
            return isPerfect;
        }
        return isPerfect;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("Enter natural number");
        try {
            number = scanner.nextInt();
            System.out.println("Nubmber " + number+" isPrime=>" + numberIsPerfect(number));

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
