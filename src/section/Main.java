package section;

public class Main {
    public static void main(String[] args) {


        Point a = new Point(1, 1);
        Point b = new Point(10, 10);
        Point c = new Point(20, 20);

        SectionAggregation ab = new SectionAggregation(a, b);
        ab.calculateDistance(a, b);
        // System.out.println(ab.getLengthOfSectionComposition());
        System.out.println(ab.toString());
        SectionComposition ac = new SectionComposition(1, 1, 10, 10);
        ac.calculateDistanceComp();
        // System.out.println(ac.getSectionCompositionDistance());
        System.out.println(ac.toString());
        SectionComposition ad = new SectionComposition(a, c);
        ad.calculateDistanceComp();
        System.out.println(ad.toString());
    }
}