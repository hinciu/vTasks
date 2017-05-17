package tasks.t_2;

/**
 * Created by sberber on 5/10/2017.
 */
public class UsePoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.setX(5);
        point.setY(6);
        point.setZ(7);

        Point point1 = new Point(1,2,3);
        System.out.println(point.getX());
        System.out.println(point.getY());
        System.out.println(point.getZ());
    }
}
