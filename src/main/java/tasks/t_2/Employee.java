package tasks.t_2;

/**
 * Created by sberber on 5/10/2017.
 */
public class Employee {
    private double tariffPerHour = 5.5;
    public int hours = 2;

    public double getSalary(){
        return  getTariffPerHour() * hours;
    }

    public double getTariffPerHour() {
        return tariffPerHour;
    }
}
