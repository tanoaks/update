package mergeSort;

public class TestBasic {

	public static void main(String[] args) {
		Basic b = new Basic();
		
		int a[]={5,6,7,8,1,3,4};
		b.input(a);
		
		b.merge( a.length-1,0);
		b.printArry();
		
		
	}
	
}
