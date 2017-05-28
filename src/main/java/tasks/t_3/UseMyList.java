package tasks.t_3;

/**
 * Created by Hinciu on 28.05.2017.
 */
public class UseMyList {
    public static void main(String[] args) {

        MyList list = new MyList();
        list.add("1");
        list.add("2");
        list.show();
        System.out.println(list.get(1));
        list.add("3");
        list.add("4");
        list.remove(3);
        list.show();
    }
}
