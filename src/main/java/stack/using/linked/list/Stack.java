package stack.using.linked.list;

public class Stack<T extends Comparable<T>> {
	
	private Node<T> top;
	private int count;
	
	//O(1)
	public boolean isEmpty() {
		return count == 0;
	}
	
	//O(1)
	public int size() {
		return count;
	}
	
	public T pop() {
		T item = top.getData();
		top = top.getNext();
		count--;
		return item;
	}
	
	public void push(T data) {
		
		if(isEmpty()) {
			top = new Node<T>(data);
		}else {
			Node<T> newNode = new Node<T>(data);
			newNode.setNext(top);
			top = newNode;
		}
		count++;
	}
	
}
