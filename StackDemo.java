import java.util.*;
class StackDemo{
public static void main(String[] args){
Stack<Integer> stack=new Stack<>();
stack.push(10);
stack.push(20);
stack.push(30);
System.out.println("Stack:" + stack);
System.out.println("Popped:" + stack.pop());
System.out.println("Top element:" + stack.peek());
System.out.println("Stack:" + stack);
}
}
