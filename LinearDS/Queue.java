public class Queue {
    private int arr [];
    private int maxSize;
    private int rear;
    //constructor
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int [maxSize];
        rear = -1;
    }
    public void enQueue(int element) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        arr[++rear] = element;
    }
    public int deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int front = arr[0];
        for(int i=0; i<rear; i++){
            arr[i] = arr[i+1]; // shift to 1 point all the element
        }
        rear--;
        maxSize--;

        return front;
    }

    public boolean isEmpty() {
        return  rear == -1;
    }

    public boolean isFull() {
        return maxSize== (maxSize-1);
    }

    public void top() {
        System.out.println(arr[0]);
    }

    public void display() {
        for(int i=0; i<maxSize; i++){
            System.out.println(arr[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Queue myQueue = new Queue(5);

        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        myQueue.enQueue(5);
        System.out.println("First display");
        myQueue.display();

        myQueue.deQueue();
        myQueue.deQueue();

        System.out.println("Display after deque");
        myQueue.display();

        System.out.println("Show first element");
        myQueue.top();


    }



}

