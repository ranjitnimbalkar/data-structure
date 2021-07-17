package linked.list.data.structure;

public class TestList {

	public static void main(String[] args) {
		
//		LinkedList<String> myLinedList = new LinkedList<String>();
//		myLinedList.insert("Rajveer");
//		myLinedList.insert("Ashvini");
//		myLinedList.insert("Ranjit");
//		
//		myLinedList.travers();
//		System.out.println(myLinedList.size());
//		
//		myLinedList.remove("Rajveer");
//		myLinedList.travers();
//		System.out.println(myLinedList.size());
		
		LinkedList<Person> myLinedList = new LinkedList<Person>();
		myLinedList.insert(new Person(5, "Rajveer"));
		myLinedList.insert(new Person(30, "Ashvini"));
		myLinedList.insert(new Person(33, "Ranjit"));
		
		myLinedList.travers();
		System.out.println(myLinedList.size());
		
		myLinedList.remove(new Person(30, "Ashvini"));
		myLinedList.travers();
		System.out.println(myLinedList.size());
	}

}
