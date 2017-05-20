package tasks.t_3;

/**
 * Created by Hinciu on 20.05.2017.
 */
public class UseMyStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.push("6");
        stack.show();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.show();
        stack.push("1");
        stack.push("1");
        stack.push("3");
        stack.show();
    }
}

