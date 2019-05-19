package block2;

/*
*Напишите программу, которая бы определяла, является ли введённая буква
(символ) гласной (постарайтесь сделать минимум четырьмя способами,
разрешается и больше). */

import java.util.Scanner;

/*Напишите программу, которая бы определяла, является ли введённая буква
(символ) гласной (постарайтесь сделать минимум четырьмя способами,
разрешается и больше).*/


public class Ex3 {
    Scanner scanner = new Scanner(System.in);
    /*a', 'e', 'i', 'o', 'u'  english vowels
     [а], [о], [и], [э], [у], [ы] russian vowels*/

    private static void methodOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter symbol");

        String input = scanner.nextLine().toLowerCase();
        char symbol = input.charAt(0);

        if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u'
                || symbol == 'а' || symbol == 'о' || symbol == 'и' ||symbol=='е' || symbol == 'э' || symbol == 'у' || symbol == 'ы') {
            System.out.println("Symbol:" + symbol + " vowel");
        } else {
            System.out.println("Not vowel!!! ");
        }
        scanner.close();

    }
    private static boolean methodTwo(char c){
        char [] vowels = {'a', 'e', 'i', 'o', 'u', 'а', 'о', 'и', 'е','э', 'у', 'ы'};
        for (int i = 0; i <=vowels.length ; i++) {
            if (c==vowels[i]){
                return true;
            }
        }  return false;
    }

    private static String methodThree (char c){
       switch (c){
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
           case 'а':
           case 'о':
           case 'и':
           case 'е':
           case 'э':
           case 'у':
           case 'ы':
               return "You are input vowel";
       }return "You are input NOT vowel";
    }

    private static String methodFour(int symbolASCII) {
        int[] vowelsASCII = {97, 101, 105, 11, 117};
        for (int i = 0; i <= vowelsASCII.length; i++) {
            if (symbolASCII == vowelsASCII[i]) {
                return "You are input vowel";
            }
        }
        return "You are input NOT vowel";
    }



    public static void main(String[] args) {

        //methodOne();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter symbol");
        String input = scanner.nextLine().toLowerCase();
        char symbol = input.charAt(0);
        /*

        if (methodTwo(symbol)){
            System.out.println("You are input vowel");
        }else {
            System.out.println("Not vowel");
        }*/


        //System.out.println(methodThree(symbol));  //Method3

        int codASCII = (int) symbol;
        System.out.println(methodFour(codASCII));

    }
}
