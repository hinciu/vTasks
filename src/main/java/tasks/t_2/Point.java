package tasks.t_2;

/**
 * Created by sberber on 5/10/2017.
 */
public class Point {
    private int x;
    private int y;
    private int z;

    Point(int x,int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;

    }
    Point(){

    }
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
