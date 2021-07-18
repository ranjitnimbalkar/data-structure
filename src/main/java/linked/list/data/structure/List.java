package linked.list.data.structure;

public interface List<T extends Comparable<T>> {

	public void insert(T data);
	
	public void remove(T data);
	
	public void travers();
	
	public int size();
	
	public Node<T> getMiddleNode();
	
	public void resvers();
}
