package tasks.t_3;

import java.util.Arrays;

/**
 * Created by sberber on 5/17/2017.
 */
public class MyStack {

    String array[] = new String[1];

    public String pop() {
        if(array.length>0) {
            String lastEl = array[array.length - 1];
            if (array[array.length - 1] != null) {
                array = creareNewArr(array, "pop");
            }
            return lastEl;
        } else{
            array = new String[1];
        }
        return null;
    }

    public void push(String element) {
        if (array[array.length - 1] != null) {
            array = creareNewArr(array, "push");
        }
        array[array.length - 1] = element;
    }

    public void show() {
        System.out.println(Arrays.toString(array));
    }

    private String[] creareNewArr(String[] array, String indicator) {
        String[] newArr = null;
        if (indicator.equals("push")) {
            newArr = new String[array.length + 1];
            for (int i = 0; i < newArr.length - 1; i++) {
                newArr[i] = array[i];
            }
        }
        if (indicator.equals("pop")) {
            newArr = new String[array.length - 1];
            for (int i = 0; i <= newArr.length - 1; i++) {
                newArr[i] = array[i];
            }
        }

        return newArr;
    }
}
