package com.example.stack;

public class LinkedListStack<T> implements Stack<T> {
	  private class Node {
	        T data;
	        Node next;

	        Node(T data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node top;

	    public LinkedListStack() {
	        top = null;
	    }

	    @Override
	    public void push(T item) {
	        Node newNode = new Node(item);
	        newNode.next = top;
	        top = newNode;
	    }

	    @Override
	    public T pop() {
	        if (isEmpty()) {
	            throw new RuntimeException("Stack is empty");
	        }
	        T data = top.data;
	        top = top.next;
	        return data;
	    }

	    @Override
	    public T peek() {
	        if (isEmpty()) {
	            throw new RuntimeException("Stack is empty");
	        }
	        return top.data;
	    }

	    @Override
	    public boolean isEmpty() {
	        return top == null;
	    }

}
