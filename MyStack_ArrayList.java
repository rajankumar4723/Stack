import java.util.ArrayList;

class Stack{
    ArrayList<Integer>al=new ArrayList<>();
    void push(int x){
        al.add(x);
    }

    int pop(){
        int res=al.get(al.size()-1);
        al.remove(al.size()-1);
        return res;
    }
    int peek(){
        return al.get(al.size()-1);
    }
    int size(){
        return al.size();
    }
    boolean isEmpty(){
        return al.isEmpty();
    }
}
public class MyStack_ArrayList {
   public static void main(String[] args) {
    Stack s=new Stack();
    s.push(10);
    s.push(29);
    s.push(45);
   
    System.out.println(s.peek());
    System.out.println(s.pop());
    System.out.println(s.size());
    System.out.println(s.isEmpty());
    
   } 
    
}
