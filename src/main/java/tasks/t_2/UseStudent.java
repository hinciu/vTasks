package tasks.t_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sberber on 5/10/2017.
 */
public class UseStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        List<Student> listOfStudents = new ArrayList<Student>();
        student1.setData("Fedor", 25);
        student2.setData("Petr",27);
        listOfStudents.add(student1);
        listOfStudents.add(student2);
        System.out.println(Student.calcAverage(listOfStudents));
    }

}
