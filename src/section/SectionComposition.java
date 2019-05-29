package section;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class SectionComposition extends Point {

    private int endX;
    private int endY;

    private double sectionCompositionDistance;

    public SectionComposition(Point a, Point b) {
        super(a.getX(), a.getY());

        this.endX = b.getX();
        this.endY = b.getY();
    }

    public SectionComposition(int startX, int startY, int endX, int endY) {
        super(startX, startY);
        this.endX = endX;
        this.endY = endY;
    }



    public double calculateDistanceComp(){
        sectionCompositionDistance = Math.pow(Math.pow(getEndX()-getX(),2)+
                                     Math.pow(getEndY()-getY(),2),1.0/2);

        MathContext mathContext = new MathContext(15, RoundingMode.HALF_UP); // для double
        BigDecimal bigDecimal = new BigDecimal(sectionCompositionDistance, mathContext);
        bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_DOWN);
        sectionCompositionDistance = bigDecimal.doubleValue();

        return sectionCompositionDistance;
    }

    public int getEndX() {
        return endX;
    }

    public int getEndY() {
        return endY;
    }

    public double getSectionCompositionDistance() {
        return sectionCompositionDistance;
    }

    @Override
    public String toString() {
        return "SectionComposition {" +
                "sectionCompositionDistance= " + sectionCompositionDistance +
                '}';



    }


}