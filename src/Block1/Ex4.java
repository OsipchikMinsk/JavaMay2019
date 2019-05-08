package Block1;
/*
* Разработайте программу, которая проверяет, что цифры четырёхзначного
числа N образуют возрастающую (убывающую) последовательность (к примеру,
число 1357 удовлетворяет условию, т.к. его цифры соответствуют следующему
неравенству: 1 &lt; 3 &lt; 5 &lt; 7, т.е. идут в порядке возрастания).*/

import java.util.Scanner;

public class Ex4 {

    /*public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите четырехзначное число");
        int a = scanner.nextInt();
        scanner.close();
        System.out.println();
        int[] number = new int[4];
        for (int i = 1; i <= 4; i++) {
            number[number.length - i] = a % 10;
            a /= 10;

        }

        int up = 0; //флаг на возрастающую последовательность
        int down = 0;  //флаг на убыающую последовательность
        for (int i = 0; i <= number.length - 2; i++) {
            if (number[i] < number[i + 1]) {
                up++;
            } else if (number[i] > number[i + 1]) {
                down++;
            }

        }
        if (up == 3) {
            System.out.println("Возрастающая последовательность");
        } else if (down == 3) {
            System.out.println("Убывающая последовательность");
        } else {
            System.out.println("Нет последовательности");
        }



    }
*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter four digit number");
        int a = scanner.nextInt();

        /*System.out.println(a/1000);
        System.out.println((a/100)%10);
        System.out.println((a/10)%10);
        System.out.println(a%10);*/

        if ((a / 1000 > (a / 100) % 10) && ((a / 100) % 10) > ((a / 10) % 10) && ((a / 10) % 10 > a % 10)) {
            System.out.println("Sequence Up => " + a / 1000 + ">" + (a / 100) % 10 + ">" + (a / 10) % 10 + ">" + a % 10);
        } else if ((a / 1000 < (a / 100) % 10) && ((a / 100) % 10) < ((a / 10) % 10) && ((a / 10) % 10 < a % 10)) {
            System.out.println("Sequence Down => " + a / 1000 + "<" + (a / 100) % 10 + "<" + (a / 10) % 10 + "<" + a % 10);
        } else {
            System.out.println("No sequence");
        }

        scanner.close();


    }
}

