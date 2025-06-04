public class QueueUsingLinkedList<T> {
    private class Node {
        T data;
        Node next;
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node front; 
    private Node rear;  
    public QueueUsingLinkedList() {
        front = null;
        rear = null;
    }
    // Add element to the rear of the queue
    public void enqueue(T data) {
        Node newNode = new Node(data);
        if (rear == null) {
            // Queue is empty
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued: " + data);
    }
    // Remove element from the front of the queue
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
        T dequeuedData = front.data;
        front = front.next;
        if (front == null) {
       // Queue became empty after dequeue
            rear = null;
        }
        System.out.println("Dequeued: " + dequeuedData);
        return dequeuedData;
    }
       // Peek the front element without removing it
    public T peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return null;
        }
        System.out.println("Peeked: " + front.data);
        return front.data;
    }
    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }
    // Display elements from front to rear
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue from front to rear: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    // Usage example
    public static void main(String[] args) {
        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();

        queue.enqueue(10);
        queue.display();

        queue.enqueue(20);
        queue.display();

        queue.enqueue(30);
        queue.display();

        queue.peek();

        queue.dequeue();
        queue.display();

        queue.dequeue();
        queue.display();

        queue.dequeue();
        queue.display();
        queue.dequeue();
    }
}
