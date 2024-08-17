package exercise.chapter_45;

public class PointSituation {

    public static void main(String[] args) {
        Point<Integer, Integer> point1 = new Point<>(1, 5);
        Point<Integer, Double> point2 = new Point<>(5, 4.55);
        Point<Double, Double> point3 = new Point<>(1.5, 5.5);

        System.out.println(point1.calcullateDistance());
        System.out.println(point2.calcullateDistance());
        System.out.println(point3.calcullateDistance());

        Point<Float, Integer> point4 = new Point<>(8.5f, 5);

        System.out.println(point4.calcullateDistance());

    }
}
