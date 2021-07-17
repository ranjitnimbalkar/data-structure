package linked.list.data.structure;

import java.util.Comparator;

public class Person implements Comparable<Person>{
	
	private int age;
	private String name;
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public int compareTo(Person o) {
//		
//		int nameResult = this.getName().compareTo(o.getName());
//		
//		return nameResult == 0 ? this.getAge() - o.getAge() : nameResult;
//	}
	
//	public int compareTo(Person o) {
//		return Comparator.comparing(p -> {
//			Person a = (Person) p;
//			return a.getName();
//		}).thenComparing(p -> {
//			Person a = (Person) p;
//			return a.getName();
//		}).compare(this, o);
//	}
	
	public int compareTo(Person o) {
		return Comparator.comparing(Person::getName).thenComparing(Person::getAge).compare(this, o);
	}

	@Override
	public String toString() {
		return "{age=" + age + ", name=" + name + "}";
	}	
	
}
