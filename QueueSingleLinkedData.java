package cs240_hwk2;

public class QueueSingleLinkedData<T> implements QueueInterface<T> {

	private Node front;
	private Node back;
	
	public void QueueSingleLinkedData(){
		front = null;
		back = null;
	}
	
	@Override
	public void enqueue(T newEntry) {
		Node newNode = new Node(newEntry, null);
		if (isEmpty())
			front = newNode;
		else 
			back.setNode(newNode);
		back = newNode;
	}

	@Override
	public T dequeue() {
		T dequeue = getFront();
		front.setData(null);
		front = front.getNextNode();
		
		if (front == null)
			back = null;
		
		return dequeue;
	}

	@Override
	public T getFront() {
		if (isEmpty())
			throw new EmptyQueueException();
		else
			return (T) front.getData();
	}

	@Override
	public boolean isEmpty() {
		return (front == null) && (back == null);
	}

	@Override
	public void clear() {
		front = null;
		back = null;
	}

}
