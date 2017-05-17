package tasks.t_2;

/**
 * Created by sberber on 5/12/2017.
 */
public class UseFigure {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        rectangle.setA(6);
        rectangle.setB(7);
        circle.setRadius(5);
        System.out.println(circle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

    }
}
