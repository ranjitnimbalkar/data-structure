package doubly.linked.list.data.structure;

import linked.list.data.structure.Person;

public class TestDoulblyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList<Person> myLinedList = new DoublyLinkedList<Person>();
		myLinedList.insert(new Person(5, "Rajveer"));
		myLinedList.insert(new Person(30, "Ashvini"));
		myLinedList.insert(new Person(33, "Ranjit"));
		
		myLinedList.traversForward();
		myLinedList.traversBackward();
	}

}
