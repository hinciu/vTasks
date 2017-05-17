package tasks.t_2;

import static java.lang.Math.pow;

/**
 * Created by sberber on 5/10/2017.
 */
public class Circle extends GraphicObject{
    private float radius;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public double calculateArea(){
        return pow(Math.PI*radius,2);
    }
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }

}
