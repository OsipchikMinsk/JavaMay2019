package block2;
/*
* В молодом возрасте дракон каждый год отращивает по три головы, но после
того, как ему исполнится 200 лет – только по две, а после 300 лет – лишь по
одной. Предполагается, что дракон появляется на свет сразу с тремя головами.
Разработайте программу, которая высчитывала бы, сколько голов и глаз у
дракона, которому N лет?*/

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age of dragon ");
        int age = scanner.nextInt();
        int head = 0;
        if (age > 300) {
            head = 600 + 200 + (age - 300);
        } else if (age >= 200 && age < 300) {
            head = 600 + (age - 200) * 2;
        } else {
            head = age * 3;
        }
        int eyes = head * 2;
        System.out.printf("Dragon %d years old has %d heads and %d eyes. %n", age, head, eyes);
    }
}
