package tasks.t_2;

/**
 * Created by sberber on 5/12/2017.
 */
public class Rectangle extends GraphicObject {
    private float a;
    private float b;


    public double calculateArea() {
        return a*b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
}
