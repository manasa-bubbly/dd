public class StackUsingLinkedList<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top; 
	// top of the stack
      public StackUsingLinkedList() {
        this.top = null;
    }
      // Push an element onto the stack
    public void push(T data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
     // Pop the top element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot pop.");
        }
        T poppedData = top.data;
        top = top.next;
        return poppedData;
    }
     // Peek the top element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty. Cannot peek.");
        }
        return top.data;
    }
    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }
    public void printStack() {
        Node current = top;
        System.out.print("Stack from top to bottom: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.printStack(); 
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        stack.printStack();
        System.out.println("Is stack empty? " + stack.isEmpty()); 
    }
}
