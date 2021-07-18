package stack.using.linked.list;

public class TestStack {

	public static void main(String[] args) {

		Stack<String> names = new Stack<>();
		names.push("Ranjit");
		names.push("Ashini");
		names.push("Rajveer");
		
		while(!names.isEmpty()) {
			System.out.println(names.pop());
		}
		
	}

}
