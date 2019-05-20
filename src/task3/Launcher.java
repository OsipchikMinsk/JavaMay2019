package task3;




public class Launcher {

    public static void main(String[] args) {
        ArrayWorker arrayWorker = new ArrayWorker();
        UserInput user = new UserInput();
        int[][] arrayRandom = new int[user.setSizeMatrix()][user.setSizeMatrix()];  //пользователь вводит с клавиатуры размер матрицы
        arrayWorker.setRandomElementInMatrix(arrayRandom, user.setRandomNumber(), user.setRandomNumber());//пользователь вводит с клавиатуры диапазаон рандомного числа
        arrayWorker.printMatrix(arrayRandom);
        System.out.println("Max element:" + arrayWorker.getMaxElement(arrayRandom));
        System.out.println("Min element:" + arrayWorker.getMinElement(arrayRandom));
        System.out.println("Arithmetic Middle:" + arrayWorker.getArithmeticMiddle(arrayRandom));
        System.out.println("Geometric Middle:" + arrayWorker.getGeometricMiddle(arrayRandom));
        if (arrayWorker.getIndexOfLocalMaximumInArray(arrayRandom) == ArrayWorker.VALUE_NOT_FOUND) {  //чтобы было понятно что такое -1
            System.out.println("LocalMaximumInArray NOT FOUND");
        } else {
            System.out.println(arrayWorker.getIndexOfLocalMaximumInArray(arrayRandom));
        }
        if (arrayWorker.getIndexOfLocalMinimumInMatrix(arrayRandom) == ArrayWorker.VALUE_NOT_FOUND) { //чтобы было понятно что такое -1
            System.out.println("LocalMaximumInArray NOT FOUND");
        } else {
            System.out.println(arrayWorker.getIndexOfLocalMinimumInMatrix(arrayRandom));
        }

        arrayWorker.transposeMatrix(arrayRandom);
       /* System.out.println();  //матрица для теста раскомментировать многострочный комментарий
        int[][] myArray = {{2, 2, 2, 2, -10, 11},
                           {2, 2, 42, 2, 1, 1},
                           {2, 2, 1, 2, 2, 36}};
        arrayWorker.printMatrix(myArray);
        System.out.println("Max element:" + arrayWorker.getMaxElement(myArray));
        System.out.println("Min element:" + arrayWorker.getMinElement(myArray));
        System.out.println("Arithmetic:" + arrayWorker.getArithmeticMiddle(myArray));
        System.out.println("Geometric Middle:" + arrayWorker.getGeometricMiddle(myArray));
        System.out.println(arrayWorker.getIndexOfLocalMinimumInMatrix(myArray));
        System.out.println(arrayWorker.getIndexOfLocalMaximumInArray(myArray));
        arrayWorker.transposeMatrix(myArray);
*/
    }
}
