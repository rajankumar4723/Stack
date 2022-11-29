import java.util.*;

public class StackJCF {
    /**
     * @param args
     */
    public static void main(String args[]) {
        StackJCF<Integer> stack = new StackJCF<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}