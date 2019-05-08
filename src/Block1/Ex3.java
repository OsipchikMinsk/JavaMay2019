package Block1;

/*
* На плоскости даны два круга с общим центром и радиусами R1 и R2 (R1 &gt;
R2). Разработайте программу нахождения площади кольца, внешний радиус
которого равен R1, а внутренний радиус равен R2.*/

public class Ex3 {

    public final static double PI = 3.141592654;

    static double square(double a) {
        return a * a;
    }

    public static void main(String[] args) {


        double r1 = 1 + Math.random() * 100;
        double r2 = 1 + Math.random() * 100;
        if (r1 > r2) {
            double squareOfRing = square(r1) * PI - square(r2) * PI;
            System.out.println("Square of ring = " + squareOfRing);
        } else {
            System.out.println("Wrong input!!! " + r1 + " < " + r2);
        }
    }
}