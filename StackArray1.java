package cs240_hwk2;

import java.util.EmptyStackException;

public class StackArray1<T> implements StackInterface<T>{
	
	private T[] stack;
	private int topIndex;
	private static final int DEFAULT_CAPACITY = 10;
	

	public StackArray1() {
		this(DEFAULT_CAPACITY);
	}


	public StackArray1(int initialSize) {
		T[] tempStack = (T[]) new Object [initialSize];
		stack = tempStack;
		topIndex = -1;
	}


	@Override
	public void push(T newEntry) {
		stack[topIndex+1] = newEntry;
		topIndex++;
	}


	@Override
	public T pop() {
		if (isEmpty())
			throw new EmptyStackException();
		else{
			T top = stack[topIndex];
			stack[topIndex] = null;
			topIndex--;
			return top;
		}
	}


	@Override
	public T peek() {
		if (isEmpty())
			throw new EmptyStackException();
		else
			return stack[topIndex];
		
	}


	@Override
	public boolean isEmpty() {
		return topIndex < 0;
	}


	@Override
	public void clear() {
		topIndex = -1;
	}
	

}
