package tasks.t_2;

/**
 * Created by sberber on 5/10/2017.
 */
public class Square {
    private float sideLength;

    public float getSideLength() {
        return sideLength;
    }

    public void setSideLength(float sideLength) {
        this.sideLength = sideLength;
    }

    public float calculateArea(){

        return sideLength*sideLength;
    }
    public float calculatePerimeter(){

        return 4*sideLength;
    }
}
