package cs240_hwk2;

import java.util.EmptyStackException;
import java.util.Vector;

public class VectorStack<T> implements StackInterface<T>{
	private Vector<T> stack;
	private static final int DEFAULT_CAPACITY = 50;
	
	public VectorStack() {
		this(DEFAULT_CAPACITY);
	}
	
	public VectorStack(int initialSize) {
		stack = new Vector<>(initialSize);
	}

	@Override
	public void push(T newEntry) {
		stack.add(newEntry);
		
	}

	@Override
	public T pop() {
		if (isEmpty())
			throw new EmptyStackException();
		else
			return stack.remove(stack.size() - 1);
		
	}

	@Override
	public T peek() {
		if (isEmpty())
			throw new EmptyStackException();
		else
			return stack.lastElement();
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty();
	}

	@Override
	public void clear() {
		stack.clear();
	}

}
