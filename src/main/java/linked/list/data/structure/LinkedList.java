package linked.list.data.structure;

public class LinkedList<T extends Comparable<T>> implements List<T>{
	
	private Node<T> head;
	private int size;

	public void insert(T data) {

		if(head == null) {
			head = new Node<T>(data);
		}else {
			insertBeginning(data);			
		}
		size++;
	}

	private void insertBeginning(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.setNext(head);			
		head = newNode;
	}
	
	private void insertEnd(T data, Node<T> node) {
		if(node.getNext() != null) {
			insertEnd(data, node.getNext());
		}else {
			//we have found the last node
			Node<T> newNode = new Node<T>(data); 
			node.setNext(newNode);
		}
	}

	public void remove(T data) {

		if(head == null) return;
		
		if(head.getData().compareTo(data) == 0) {
			head = head.getNext();
			size--;
		}else {
			remove(data, head, head.getNext());
		}
		
	}

	private void remove(T data, Node<T> previousNode, Node<T> currentNode) {

		while(currentNode != null) {
			
			if(currentNode.getData().compareTo(data) == 0) {
				previousNode.setNext(currentNode.getNext());
				size--;
				currentNode.setNext(null);
				currentNode = null;
				return;
			}
			
			previousNode = previousNode.getNext();
			currentNode = currentNode.getNext();
		}
		
	}

	public void travers() {
		if(head == null) return;
		Node<T> currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode + "--->");
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}

	public int size() {
		// TODO Auto-generated method stub
		return size;
	}	
	
}
