package cs240_hwk2;
import java.util.EmptyStackException;

public class StackLinkedData<T> implements StackInterface<T>{
	private Node topNode;
	
	public StackLinkedData() {
		topNode = null;
	}

	@Override
	public void push(Object newEntry) {
		topNode = new Node(newEntry, topNode);
	}

	@Override
	public T pop() {
		T popped = peek();
		topNode = topNode.getNextNode();
		return popped;
	}

	@Override
	public T peek() {
		if (isEmpty())
			throw new EmptyStackException();
		else
			return (T) topNode.getData();
	}

	@Override
	public boolean isEmpty() {
		return topNode == null;
	}

	@Override
	public void clear() {
		topNode = null;
	}

}
