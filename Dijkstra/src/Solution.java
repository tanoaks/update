import java.util.ArrayList;


public class Solution {

	
	public static void main(String[] args) {
		Node a = new Node();
		Node b = new Node();
		Node c= new Node();
		ArrayList<Node> check = new ArrayList<Node>();
		check.add(a);
		check.add(b);
		check.add(c);
		
		
		 int index=check.indexOf(b);
		System.out.println(index);
	
	}
	
	
}
