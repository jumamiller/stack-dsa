package com.bikebuka.portal;

import java.util.ArrayList;

public class StackImplementation<T> {
    private final ArrayList<T> arr;

    //creating stack
    StackImplementation() {
        arr = new ArrayList<>();
    }

    // Add elements into stack
    public void push(T x) {
        System.out.println("Inserting " + x);
        System.out.println(x);
        arr.add(x);
    }

    // Remove element from stack
    public T pop() {
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr.get((arr.size() - 1));
    }

    public void printStack() {
        for (int i = 0; i <= arr.size()-1; i++) {
            System.out.println(arr.get(i));
        }
    }

    // Check if the stack is empty
    public Boolean isEmpty() {
        return arr.size() == 0;
    }
}
