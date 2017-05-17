package tasks.t_2;

import java.util.List;

/**
 * Created by sberber on 5/10/2017.
 */
public class Student {
    private String name;
    private int age;

    public void setData(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static float calcAverage(List<Student> list) {
        int ages = 0;
//        for (int i = 0; i < list.size(); i++) {
//            ages += list.get(i).age;
//        }
        for (Student student : list) {
            ages += student.age;
        }
        return ages / list.size();
    }
}
