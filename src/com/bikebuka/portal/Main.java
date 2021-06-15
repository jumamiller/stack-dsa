package com.bikebuka.portal;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here,
        StackImplementation<Integer> stack = new StackImplementation<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        System.out.println("\nAfter popping out");

        stack.printStack();

    }
}
