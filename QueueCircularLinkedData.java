package cs240_hwk2;

public class QueueCircularLinkedData<T> implements QueueInterface<T> {

	private Node freeNode; //last empty node in queue
	private Node firstNode; //first node in queue
	
	public QueueCircularLinkedData(){
		freeNode = new Node(null, null);
		freeNode.setNode(freeNode);
		firstNode = freeNode;
	}
	@Override
	public void enqueue(T newEntry) {
		if (isQueueFull()){
			System.out.println("Current queue is full");
		}
		else{
			Node newNode = new Node(newEntry, firstNode);
			freeNode.setNode(newNode);
		}
	}

	private boolean isQueueFull() {
		int count = 0;
		Node current = this.firstNode;
		while(current != null){
			count++;
			current = current.getNextNode();
		}
		if (count < 10)
			return false;
		else
			return true;
	}
	
	@Override
	public T dequeue() {
		T front = getFront();
		firstNode.setData(null);
		firstNode = firstNode.getNextNode();
		return front;
		
	}

	@Override
	public T getFront() {
		if (isEmpty())
			throw new EmptyQueueException();
		else 
			return (T) firstNode.getData();
	}

	@Override
	public boolean isEmpty() {
		return firstNode == freeNode;
	}

	@Override
	public void clear() {
		firstNode = freeNode;
		
	}

}
