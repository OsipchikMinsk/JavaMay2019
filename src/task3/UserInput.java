package task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);

    public int setSizeMatrix() {
        int n = 0;
        while ((n <= 0)) {
            System.out.println("Enter size of Matrix N:M.  Number must be > 0!!!");
            //User вводит числа, пока оно не будет >0, т.к. размер матрицы не може быть <= 0
            System.out.println("Enter Size > 0 ");
            n = scanner.nextInt();

            while (n <= 0) {
                System.out.println("Tray again");
                n = scanner.nextInt();
            }
        }
        return n;
    }

    private boolean isFirst = true; //явояется ли число последним
    int start = 0; //старт рандомного числа
    int finish = 0;  //конец диапазана рандомного числа

    public int setRandomNumber() { //метод задает от кого и до какого числа
        if (isFirst) {
            System.out.println("Enter start value of random number in Matrix");
            try {
                start = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Only numbers are allowed. Please check your input. ");
                e.printStackTrace();
            }
            isFirst=false;
            return start;
        } else {
            System.out.println("Enter finish value of random number in Matrix, your number must be > than first number");
            try {
                finish = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Only numbers are allowed. Please check your input. ");
                e.printStackTrace();
            }
            if (finish <= start) {
                while (finish <= start) {
                    System.out.println("Tray again");
                    try {
                        finish = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.print("Only numbers are allowed. Please check your input. ");
                        e.printStackTrace();
                        break;
                    }
                }
            }
            isFirst=true;  //для иниверсальности дальнейшего ввода
            return finish;
        }
    }
}

