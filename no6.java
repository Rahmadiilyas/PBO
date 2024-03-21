import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class no6 {

    public static void main(String[] args) {
        // Stack menggunakan array
        StackArray stackArray = new StackArray(5);
        stackArray.push(10);
        stackArray.push(20);
        stackArray.push(30);
        System.out.println("StackArray: " + stackArray);
        System.out.println("Pop: " + stackArray.pop());
        System.out.println("Peek: " + stackArray.peek());
        System.out.println("Is Empty: " + stackArray.isEmpty());
        System.out.println();

        // Stack menggunakan Vector
        StackVector stackVector = new StackVector();
        stackVector.push(40);
        stackVector.push(50);
        stackVector.push(60);
        System.out.println("StackVector: " + stackVector);
        System.out.println("Pop: " + stackVector.pop());
        System.out.println("Peek: " + stackVector.peek());
        System.out.println("Is Empty: " + stackVector.isEmpty());
        System.out.println();

        // Stack menggunakan ArrayList
        StackArrayList stackArrayList = new StackArrayList();
        stackArrayList.push(70);
        stackArrayList.push(80);
        stackArrayList.push(90);
        System.out.println("StackArrayList: " + stackArrayList);
        System.out.println("Pop: " + stackArrayList.pop());
        System.out.println("Peek: " + stackArrayList.peek());
        System.out.println("Is Empty: " + stackArrayList.isEmpty());
        System.out.println();

        // Stack menggunakan LinkedList
        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push(100);
        stackLinkedList.push(110);
        stackLinkedList.push(120);
        System.out.println("StackLinkedList: " + stackLinkedList);
        System.out.println("Pop: " + stackLinkedList.pop());
        System.out.println("Peek: " + stackLinkedList.peek());
        System.out.println("Is Empty: " + stackLinkedList.isEmpty());
    }
}

class StackArray {
    private int maxSize;
    private double[] stackArray;
    private int top;

    public StackArray(int size) {
        maxSize = size;
        stackArray = new double[maxSize];
        top = -1;
    }

    public void push(double value) {
        stackArray[++top] = value;
    }

    public double pop() {
        return stackArray[top--];
    }

    public double peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i <= top; i++) {
            sb.append(stackArray[i]).append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}

class StackVector {
    private Vector<Double> stackVector;

    public StackVector() {
        stackVector = new Vector<>();
    }

    public void push(double value) {
        stackVector.add(value);
    }

    public double pop() {
        double value = stackVector.lastElement();
        stackVector.remove(stackVector.size() - 1);
        return value;
    }

    public double peek() {
        return stackVector.lastElement();
    }

    public boolean isEmpty() {
        return stackVector.isEmpty();
    }

    @Override
    public String toString() {
        return stackVector.toString();
    }
}

class StackArrayList {
    private ArrayList<Double> stackArrayList;

    public StackArrayList() {
        stackArrayList = new ArrayList<>();
    }

    public void push(double value) {
        stackArrayList.add(value);
    }

    public double pop() {
        double value = stackArrayList.get(stackArrayList.size() - 1);
        stackArrayList.remove(stackArrayList.size() - 1);
        return value;
    }

    public double peek() {
        return stackArrayList.get(stackArrayList.size() - 1);
    }

    public boolean isEmpty() {
        return stackArrayList.isEmpty();
    }

    @Override
    public String toString() {
        return stackArrayList.toString();
    }
}

class StackLinkedList {
    private LinkedList<Double> stackLinkedList;

    public StackLinkedList() {
        stackLinkedList = new LinkedList<>();
    }

    public void push(double value) {
        stackLinkedList.addLast(value);
    }

    public double pop() {
        return stackLinkedList.removeLast();
    }

    public double peek() {
        return stackLinkedList.getLast();
    }

    public boolean isEmpty() {
        return stackLinkedList.isEmpty();
    }

    @Override
    public String toString() {
        return stackLinkedList.toString();
    }
}
