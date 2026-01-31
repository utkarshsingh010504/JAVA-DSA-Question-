import java.util.Scanner;
public class initialitationcircularqueue {
    private int[] queue;
    private int front, rear, size;
    public initialitationcircularqueue(int capacity) {
        size = capacity;
        queue = new int[size];
        front = rear = -1;
    }
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % size;
        queue[rear] = value;
        System.out.println(value + " enqueued");
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = queue[front];
        if (front == rear) front = rear = -1;
        else front = (front + 1) % size;
        return value;
    }
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        System.out.print("Queue elements: ");
        while (i != rear) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println(queue[rear]);
    }
    public boolean isFull() {
        return (rear + 1) % size == front;
    }
    public boolean isEmpty() {
        return front == -1;
    }
    public int frontValue() {
        if (isEmpty()) {
            System.out.println("Queue is empty :");
            return -1;
        }
        return queue[front];
    }
    public int rearValue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[rear];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int capacity = scanner.nextInt();
        initialitationcircularqueue queue = new initialitationcircularqueue(capacity);
        while (true) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Front Value");
            System.out.println("5. Rear Value");
            System.out.println("6. Check if Full");
            System.out.println("7. Check if Empty");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    int dequeued = queue.dequeue();
                    if (dequeued != -1) {
                        System.out.println(dequeued + " dequeued");
                    }
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.out.println("Front value: " + queue.frontValue());
                    break;
                case 5:
                    System.out.println("Rear value: " + queue.rearValue());
                    break;
                case 6:
                    System.out.println("Is queue full? " + queue.isFull());
                    break;
                case 7:
                    System.out.println("Is queue empty? " + queue.isEmpty());
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}