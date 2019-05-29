package tests;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Main {


    public static boolean isFlippedToHead() {
        int rand_0_or_1 = new Random().nextInt(2); // 0 corresponds to head, 1 to tail
        if (rand_0_or_1 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in).useLocale(Locale.US);



            System.out.print("Enter number to flip the coin: ");
            long startTime = System.currentTimeMillis();
            int repeatsNum = in.nextInt();

            int headsCount = 0;
            int tailsCount = 0;

            for (int i = 0; i < repeatsNum; i++) {
                if (isFlippedToHead()) {
                    headsCount++;
                } else {
                    tailsCount++;
                }
            }

            System.out.println("Numbers of heads: " + headsCount + ", number of tails: " + tailsCount);
            long timeSpent = System.currentTimeMillis() - startTime;
            System.out.println("программа выполнялась " + timeSpent + " миллисекунд");


            long startTime1 = System.currentTimeMillis();
            int countHeads = 0;
            int countTails = 0;
            int headsOrTail = 0;
            for (int i = 0; i < 1000000; i++) {
                headsOrTail = new Random().nextInt(2); //1 - Heads; 2 - Tails
                if (headsOrTail == 1) {
                    countHeads++;
                } else {
                    countTails++;
                }
            }
            System.out.println("Heads=" + countHeads + "\nTails =" + countTails);
            long timeSpent1 = System.currentTimeMillis() - startTime1;
            System.out.println("программа выполнялась " + timeSpent1 + " миллисекунд");

        }
    }