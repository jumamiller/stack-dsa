package com.bikebuka.portal;

public class StackImplementation {
    private int[] arr;
    private int top;
    private int capacity;

    //creating stack
    StackImplementation(int size){
        arr= new int[size];
        capacity = size;
        top=-1;
    }
    // Add elements into stack
    public void push(int x){
        if(isFull()){
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top]=x;
    }
    // Remove element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[top--];
    }
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    // Check if the stack is full
    public boolean isFull(){
     return top == capacity-1;
    }
    // Check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }
    // Utility function to return the size of the stack
    public int size() {
        return top + 1;
    }

}
