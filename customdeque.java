public class customdeque {
    private int[] queue;
    private int front, rear,capacity,size;
    public customdeque(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public void enqueue(int  value){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        rear = (rear +1)% capacity;
        queue[rear] = value;
        size++;
    }
    public int deque(){
        if (isEmpty()){
            System.out.println("Queue is full");
            return 0;
        }
        int value = queue[front];
        rear = (rear+1)%capacity;
        front = (front +1)%capacity;
        size--;
        return value;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return-1;
        }
        return queue[front];
    }
    public boolean isFull(){
        return size == capacity;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public static void main(String[] args){
        customdeque queue =new customdeque(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("peak:"+queue.peek());
        System.out.println("Dequeued:"+queue.deque());
        System.out.println("is Empty:"+queue.isEmpty());
    }
}

