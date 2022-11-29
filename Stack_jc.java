public import java.util.*;

public class Stack2 {
    public static void main(String args[]) {
        Statck2<Integer> stack = new Stack2()<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
} {
    
}
