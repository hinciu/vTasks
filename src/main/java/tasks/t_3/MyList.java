package tasks.t_3;

import java.util.Arrays;

/**
 * Created by Hinciu on 28.05.2017.
 */
public class MyList {
    String array[] = new String[1];

    public void add(String element) {
        if (array[array.length - 1] != null) {
            array = creareNewArr(array,"add");
        }
        array[array.length - 1] = element;

    }
    public String get(int index){
        String result=null;
        if (index > array.length){

        }else {
            result = array[index];
        }
        return result;
    }
    public void remove(int index){
        String []newArr = creareNewArr(array, "rem");
        int k = 0;
        for (int i = 0; i <newArr.length;i++ ){
            if (k == index){
                k++;
            }
            newArr[i] = array[k++];
        }
        array = newArr;

    }

    private String[] creareNewArr(String[] array,String indicator) {
        String[] newArr = null;

        if (indicator.equals("add")) {
            newArr = new String[array.length + 1];
            for (int i = 0; i < newArr.length - 1; i++) {
                newArr[i] = array[i];
            }
        }
        if (indicator.equals("rem")) {
            newArr = new String[array.length - 1];
            return newArr;
        }
        return newArr;
    }
    public void show() {
        System.out.println(Arrays.toString(array));
    }
}
