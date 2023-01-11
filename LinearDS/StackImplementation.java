public class StackImplementation {
    private int [] arr;
    private int top;
    private int maxSize;

    public StackImplementation(int n) {
        maxSize = n;
        arr = new int[maxSize];
        top = -1;
    }
    public void push(int num) {
        arr[++top] = num;
    }
    public int pop() {
        return arr[top--];
    }
    public int peek() {
        return arr[top];
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    public boolean isEmpty() {
        return (top == -1);
    }
}


public class Main {
    public static void main(String[] args) {

        StackImplementation myStack = new StackImplementation(6);

        myStack.push(2);
        myStack.push(4);
        myStack.push(1);
        myStack.push(8);
        myStack.push(5);
        myStack.push(7);

        while(!myStack.isEmpty()) { //myStack.isFull

            int value = myStack.pop();
            int show = myStack.peek();

            System.out.println("Pop vaue: " + value);
        }
 
