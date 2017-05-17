package tasks.t_2;

/**
 * Created by sberber on 5/10/2017.
 */
public class Manager extends Employee {
    @Override
    public double getSalary() {
        return (super.getSalary() * 1.5);
    }
}
