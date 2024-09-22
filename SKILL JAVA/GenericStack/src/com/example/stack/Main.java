package com.example.stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> intArrayStack = new ArrayStack<>(5);
        intArrayStack.push(1);
        intArrayStack.push(2);
        intArrayStack.push(3);
        System.out.println("ArrayStack (Integer) peek: " + intArrayStack.peek());
        System.out.println("ArrayStack (Integer) pop: " + intArrayStack.pop());
        System.out.println("ArrayStack (Integer) isEmpty: " + intArrayStack.isEmpty());

        // Test LinkedListStack with String
        Stack<String> stringLinkedListStack = new LinkedListStack<>();
        stringLinkedListStack.push("apple");
        stringLinkedListStack.push("banana");
        stringLinkedListStack.push("cherry");
        System.out.println("LinkedListStack (String) peek: " + stringLinkedListStack.peek());
        System.out.println("LinkedListStack (String) pop: " + stringLinkedListStack.pop());
        System.out.println("LinkedListStack (String) isEmpty: " + stringLinkedListStack.isEmpty());

        // Test ArrayStack with Double
        Stack<Double> doubleArrayStack = new ArrayStack<>(3);
        doubleArrayStack.push(1.1);
        doubleArrayStack.push(2.2);
        doubleArrayStack.push(3.3);
        System.out.println("ArrayStack (Double) peek: " + doubleArrayStack.peek());
        System.out.println("ArrayStack (Double) pop: " + doubleArrayStack.pop());
        System.out.println("ArrayStack (Double) isEmpty: " + doubleArrayStack.isEmpty());
    }

	}


