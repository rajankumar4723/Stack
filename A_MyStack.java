import java.io.EOFException;
import java.security.DrbgParameters.Reseed;

class Stack{
    int a[];
    int top;
    int capacity;


Stack(int capacity){
    this.capacity=capacity;
    top=-1;
    a=new int [capacity];

}
void push(int data){
    if(top==capacity-1){
        throw new Exception();
    }
    top++;
    a[top]=data;
}
int pop(){
    if(top==-1){
        throw new Exception();
    }
    int res=a[top];
    top--;
    return res;
}
int peek(){
    if (top==-1) {
        throw new Exception();
        
    }
    return res[top];
}
boolean isEmpty(){
    return top==-1;
}
}
public class A_MyStack {
    public static void main(String[] args) {
        Stack obj=new Stack(5);
        obj.push(10);
        obj.push(34);
        obj.push(56);
        System.out.println(obj.capacity);
    }
    
}
