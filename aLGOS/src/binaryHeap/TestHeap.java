package binaryHeap;

public class TestHeap {
public static void main(String[] args) {
	
int a[]={1,2,3,4,5,6,7,8,9,10,0,0,0,0,0,0};	
	BinaryHeap b = new BinaryHeap(10, 0);
	b.add(11);
	b.add(2);
	b.add(3);
	b.add(4);
	b.add(5);
	b.add(6);
	b.add(8);
	b.add(9);
	b.add(10);
	
	b.remove(1);
	
	b.print();
	
}
	
	
	
}
