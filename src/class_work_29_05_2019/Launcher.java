package class_work_29_05_2019;
import java.util.Random;
import java.util.Scanner;
/*
* Дана последовательность x1,x2x...xn. Найти наибольший по модулю элементпоследовательности с указанием его номера*/

public class Launcher {
    private Random random = new Random();

    private Scanner scan = new Scanner(System.in);

   private  Launcher() {

    }

    private int findMaxElement(int[] array) {
        int size = array.length; //длина массива
        boolean isNumberInArrayEquals = false; //проверка на одинаковые элементы
        int maxElement = 0;          //максимальный элемент
        int index = 0;              //индекс макисмимального элемента
        for (int i = 0; i < size; i++) {
            int valueInArray = Math.abs(array[i]);  //Элемент по модулю в массиве
            if (valueInArray > maxElement) {
                maxElement = Math.abs(array[i]);     //приведение элементы к модулю
                index = i;
            }
            if (array[i] == maxElement) {
                isNumberInArrayEquals = true;
            } else {
                isNumberInArrayEquals = false;
            }
        }
        if (isNumberInArrayEquals) {
            System.out.println("All element in array are equals ");
        }
        System.out.println("Index = " + index);
        return maxElement;
    }

    private void printArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    private void toFillArrayRandomValue(int[] array) {  //заполняем случайными числами массив

        int size = array.length;
        for (int i = 0; i < size; i++) {
           // array[i] = -10 + random.nextInt(20);    //заполнение массива случайными числами от -10 до 10
            System.out.printf("Enter %d value in array: ", i);
            array[i]=scan.nextInt();
        }


    }

    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        launcher.toFillArrayRandomValue(array);
        launcher.printArray(array);
        int maxElementInArray = launcher.findMaxElement(array);
        System.out.println("Max Value = " + maxElementInArray);
    }
 }
