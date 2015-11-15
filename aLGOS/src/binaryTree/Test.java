package binaryTree;

public class Test {
	
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.put(1, 10);
		bt.put(2, 11);
		bt.put(8, 12);
		bt.put(9, 13);
		bt.put(6, 14);
		bt.put(4, 15);bt.put(5, 16);
		int a[]= new int[11];
		bt.getsorted(a,1);
		
	System.out.println(bt.get(4).getvalue());	
		for(int i=0;i<a.length;i++)
		{System.out.println(a[i]);}
		
	
	}

}
