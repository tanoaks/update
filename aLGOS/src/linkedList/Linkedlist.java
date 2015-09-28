package linkedList;

public class Linkedlist {

	private String Store;
	private Linkedlist next;
	private Linkedlist prev;
	public Linkedlist push(String value)
	{	next=new Linkedlist();
		next.Store=value;
		next.prev=this;
	return next;
		
	}
	public Linkedlist pop()
	{	
		next=null;
		if(this.prev!=null){
			this.getval();
		return this.prev;}
		else{
			System.out.println("NULL");
			return this.prev;
			
		}
	}
	
	public void getval()
	{
		System.out.println(this.Store);
	}
	
}
