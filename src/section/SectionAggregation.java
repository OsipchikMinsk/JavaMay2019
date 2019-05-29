package section;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class SectionAggregation {

    private Point point;

    private double lengthOfSectionAggregation;

    public SectionAggregation(Point a, Point b) {
        this.point = a;
        this.point = b;
    }

    public double getLengthOfSectionComposition() {
        return lengthOfSectionAggregation;
    }

    public double calculateDistance(Point a, Point b) {
        lengthOfSectionAggregation = Math.pow((Math.pow(b.getX() - a.getX(), 2)) +
                (Math.pow(b.getY() - a.getY(), 2)), 1.0 / 2);

        MathContext mathContext = new MathContext(15, RoundingMode.HALF_UP); // для double
        BigDecimal bigDecimal = new BigDecimal(lengthOfSectionAggregation, mathContext);
        bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_DOWN);
        lengthOfSectionAggregation = bigDecimal.doubleValue();
        return lengthOfSectionAggregation;
    }

    @Override
    public String toString() {
        return "SectionAggregation {" +
                "lengthOfSectionAggregation= " + lengthOfSectionAggregation +
                '}';
    }
}