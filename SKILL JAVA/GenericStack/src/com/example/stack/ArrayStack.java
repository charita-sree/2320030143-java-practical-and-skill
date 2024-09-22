package com.example.stack;
import java.util.Arrays;


public class ArrayStack<T> implements Stack<T> {
	  private T[] array;
	    private int size;
	    private int top;

	    @SuppressWarnings("unchecked")
	    public ArrayStack(int capacity) {
	        array = (T[]) new Object[capacity];
	        size = capacity;
	        top = -1;
	    }

	    @Override
	    public void push(T item) {
	        if (top == size - 1) {
	            // Resize the array if it's full
	            array = Arrays.copyOf(array, size * 2);
	            size *= 2;
	        }
	        array[++top] = item;
	    }

	    @Override
	    public T pop() {
	        if (isEmpty()) {
	            throw new RuntimeException("Stack is empty");
	        }
	        return array[top--];
	    }

	    @Override
	    public T peek() {
	        if (isEmpty()) {
	            throw new RuntimeException("Stack is empty");
	        }
	        return array[top];
	    }

	    @Override
	    public boolean isEmpty() {
	        return top == -1;
	    }

}
