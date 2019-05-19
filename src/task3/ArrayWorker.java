package task3;
/*
@author OsipchikMinsk

* Задана матрица размера N x M. Необходимо выполнить следующие
действия:
1 найти экстремальные значения (минимальный и максимальный
элементы) данной матрицы;

2 найти среднеарифметическое и среднегеометрическое значения всех
элементов матрицы;

3 найти позицию первого встретившегося локального минимума
(максимума), а если таких элементов нет, то возвратить -1 (локальный
минимум– это элемент, который меньше любого из своих соседей; локальный
максимум – это элемент, который больше любого из своих соседей);

4 транспонировать матрицу (при решении данного задания не
рекомендуется задействовать дополнительную память).*/

import java.util.Random;

class ArrayWorker {

    Random random = new Random();
    int arraySizeColumn;
    int arraySizeRow;
    private final int VALUE_NOT_FOUND = -1;


    private void calculateArrayLengths(int[][] array) { //подсчет горизонтальных и вериткальных ячеек

        arraySizeColumn = array.length;      //вертикаль
        arraySizeRow = array[0].length;   //горизонталь
    }


    void setRandomElementInMatrix(int[][] array, int startRandom, int finishRandom) {
        /*@param startRandom  начальный диапазон рандомного числа
        /*@param finishRandom  конечный диапазон рандомного числа
        * */
        calculateArrayLengths(array);
        for (int i = 0; i < arraySizeColumn; i++) {
            for (int j = 0; j < arraySizeRow; j++) {
                array[i][j] = startRandom + random.nextInt(finishRandom);
            }
        }
    }

    void printMatrix(int[][] matrix) {
        calculateArrayLengths(matrix);
        for (int i = 0; i < arraySizeColumn; i++) {
            for (int j = 0; j < arraySizeRow; j++) {
                System.out.printf("%4d",matrix[i][j] );
            }
            System.out.println();
        }
    }
    /*1 найти экстремальные значения (минимальный и максимальный
            элементы) данной матрицы;*/


    public int getMaxElement(int[][] matrix) {   //поиск максимального элемента
        int maxElement = 0;
        calculateArrayLengths(matrix);
        for (int i = 0; i < arraySizeColumn; i++) {
            for (int j = 0; j < arraySizeRow; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }

        }
        return maxElement;
    }

    public int getMinElement(int[][] matrix) {  //поиск минимального элемента
        int minElement = matrix[0][0];
        calculateArrayLengths(matrix);
        for (int i = 0; i < arraySizeColumn; i++) {
            for (int j = 0; j < arraySizeRow; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                }
            }

        }
        return minElement;
    }

    /*2 найти среднеарифметическое и среднегеометрическое значения всех
элементов матрицы;*/
    public double getArithmeticMiddle (int [][] matrix){   //Арифметическое среднее
        double arithmeticMiddle = 0;
        calculateArrayLengths(matrix);
        for (int i = 0; i < arraySizeColumn; i++) {
            for (int j =0;j<arraySizeRow;j++){
                arithmeticMiddle = arithmeticMiddle + matrix[i][j];
            }
        }return arithmeticMiddle/(arraySizeColumn *arraySizeRow);
    }


    public double getGeometricMiddle (int [][] matrix){ //Геометрическое среднее
        double geometricMiddle = 1.0d;
        calculateArrayLengths(matrix);
        for (int i = 0; i < arraySizeColumn; i++) {
            for (int j =0;j<arraySizeRow;j++){
                if(matrix[i][j]==0){
                    return 0.0d;
                }
                geometricMiddle = geometricMiddle * matrix[i][j];
            }
        }return Math.pow(Math.abs(geometricMiddle),1.0d/(arraySizeColumn *arraySizeRow));
    }

    /*3 найти позицию первого встретившегося локального минимума
(максимума)*/

    public int getIndexOfLocalMinimumInMatrix(int[][] matrix) {  //поиск локального мининмума
        calculateArrayLengths(matrix);
        int penultimateIndex = arraySizeRow-1; //предпоследний индекс справа
        for (int i = 0; i < arraySizeColumn; i++) {
            for (int j = 1; j < penultimateIndex; j++) {
                if ((matrix[i][j] < matrix[i][j - 1]) &&(matrix[i][j] < matrix[i][j + 1])) {
                    System.out.printf("Index[%1d][%1d] Local minValue:", i, j);
                    return matrix[i][j];
                }
            }
        }return VALUE_NOT_FOUND;

    }

    public int getIndexOfLocalMaximumInArray(int[][] matrix) {  //поиск локального максимума
        calculateArrayLengths(matrix);
        int penultimateIndex = arraySizeRow-1;  //предпоследний индекс справа
        for (int i = 0; i < arraySizeColumn; i++) {
            for (int j = 1; j < penultimateIndex; j++) {
                if ((matrix[i][j] > matrix[i][j - 1]) && (matrix[i][j] > matrix[i][j + 1])) {
                    System.out.printf("Index[%1d][%1d] Local maxValue:", i, j);
                    return matrix[i][j];
                }
            }
        }
        return VALUE_NOT_FOUND;

    }
    /*4 транспонировать матрицу (при решении данного задания не
            рекомендуется задействовать дополнительную память)*/

    public int [][] transposeMatrix (int [][] matrix){
        calculateArrayLengths(matrix);
        if (arraySizeColumn==arraySizeRow){
            return transposeSquareMatrix(matrix);
        } else {
            return  transposeRectangleMatrix(matrix);
        }

    }


    public int[][] transposeRectangleMatrix(int[][] matrix) {
        calculateArrayLengths(matrix);
        int[][] transposeMatrix = new int[arraySizeRow][arraySizeColumn];
        for (int i = 0; i < arraySizeColumn; i++) {
            for (int j = 0; j < arraySizeRow; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        printMatrix(transposeMatrix);
        return transposeMatrix;
    }

    public int[][] transposeSquareMatrix(int[][] matrix) {

        for (int i = 0; i < arraySizeColumn; i++) {
            for (int j = i + 1; j < arraySizeRow; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }
        printMatrix(matrix);
        return matrix;
    }
}