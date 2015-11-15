package binaryTree;

public class BinaryTree {
	private int rank;
	private Integer key;
	private int value;
	private BinaryTree left;
	private BinaryTree right;
	
	
	

	public int getvalue()
	{return this.value;}
	
	
	public void getsorted(int[] a, Integer count)
	{	if(left!=null)
		left.getsorted( a,count);
		a[count++]=this.value;
		if(right!=null)
		right.getsorted(a,count);
		
		
		
	}
			
			
			
 public BinaryTree get(Integer key)
 {	if(this.key==null)
	 return this;
 else if(key==this.key)
	 return this;
	 
	 else if(key>this.key)
	 {
		return right.get(key); 
	 }
	 else if (key<this.key)
	 {
		return   left.get(key);
		 
	 }
	 return null;}

public void  put(Integer key,int value)
{
if(this.key==null)
	{this.key=key;
	this.value=value;
	}
else if(key>this.key){
	if(right==null)
	right=new BinaryTree();
	right.put(key, value);
}
else if(key<this.key){
	if(left==null)
	left= new BinaryTree();
	left.put(key, value);}
else
	this.value=value;
}
}
