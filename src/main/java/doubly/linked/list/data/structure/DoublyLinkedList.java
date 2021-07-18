package doubly.linked.list.data.structure;

import com.sun.xml.internal.bind.v2.bytecode.ClassTailor;

import linked.list.data.structure.List;

public class DoublyLinkedList<T extends Comparable<T>>{
	
	private Node<T> head;
	private Node<T> tail;

	public void insert(T data) {
		Node<T> newNode = new Node<>(data);		
		//first element in the list
		if(tail == null) {
			//both the pointers are pointing to new node
			head = newNode;
		    tail = newNode;
		}else {
			//insert node at the end of the queue O(1)
			newNode.setPrevious(tail);
			tail.setNext(newNode);
			tail = newNode;
		}		
	}

	public void remove(T data) {
		// TODO Auto-generated method stub
		
	}

	public void traversForward() {
		
		Node<T> currentNode = head;
		
		while(currentNode != null) {
			System.out.print(currentNode.getData() + "--->");
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}
	
	public void traversBackward() {
		
		Node<T> currentNode = tail;
		
		while(currentNode != null) {
			System.out.print(currentNode.getData() + "--->");
			currentNode = currentNode.getPrevious();
		}
		System.out.println();
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
