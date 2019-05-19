package block2;
/*
* На прямоугольной декартовой системе координат на плоскости заданы три
точки с соответствующими координатами в виде пары значений (x,y).
Определить, являются ли данные точки вершинами треугольника. И если да, то
дополнительно определить, является ли данный треугольник прямоугольным.*/


public class Ex1 {

    public static double calcDistance(double x1, double x2, double y1, double y2) {
        return Math.pow((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1), 1.0 / 2);
    }
    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 0;
        int x3 = 10;
        int y1 = 10;
        int y2 = 0;
        int y3 = 0;
       /*
        A (x1;y1)
        B (x2;y2)
        C (x3;y3)*/

        double aB = calcDistance(x2, x1, y2, y1);
        double aC = calcDistance(x3, x1, y3, y1);
        double bC = calcDistance(x3, x2, y3, y2);
        if ((aB + aC) <= bC || (aC + bC) <= aC || (aB + bC) <= aC) {
            System.out.println("Not a Triangle");
        } else {
            System.out.print("It is a Triangle ");
            if ((aB * aB == aC * aC + bC * bC) || (bC * bC == aC * aC + aB * aB) || (aC * aC == aB * aB + bC * bC)) {
                System.out.println("Trigle is rectangular");
            }
        }
    }
}