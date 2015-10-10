package mergeSort;

public class TestBasic {

	public static void main(String[] args) {
		Basic b = new Basic();
		
		int a[]={2,23,2,2,1,3,4,5,2,1,4,6,5,7,8,6,9,457};
		b.input(a);
		
		b.sort(a);
		b.printArry();
		
		
	}
	
}
