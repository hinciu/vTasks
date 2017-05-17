package tasks.t_2;

/**
 * Created by sberber on 5/10/2017.
 */
public class UseEmployee {
    public static void main(String[] args) {
        Employee employee =new Employee();
        Manager manager = new Manager();
        System.out.println(employee.getSalary());
        System.out.println(manager.getSalary());
    }
}
