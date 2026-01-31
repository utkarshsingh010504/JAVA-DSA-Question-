public class circularqueue {
        private int[] queue;
        private int front, rear, size, capacity;

        public circularqueue(int capacity){
            this.capacity = capacity;
            this.queue = new int[capacity];
            this.front = 0;
            this.rear = -1;
            this.size = 0;
        }
        public void enqueue(int value){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            rear = (rear+1)%capacity;
            queue[rear] = value;
            size++;
        }
        public int dequque(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int value = queue[front];
            front = (front+1)%capacity;
            size--;
            return value;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
            }
            return  queue[front];
        }
        public boolean isFull(){
            return size == capacity;
        }
        public boolean isEmpty(){
            return size == 0;
        }

    public static void main(String[] args) {
        circularqueue cq = new circularqueue(5);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        System.out.println("peek:"+cq.peek());
        System.out.println("Dequeued:"+cq.dequque());
        System.out.println("is queue Empty:"+cq.isEmpty());
    }
}

