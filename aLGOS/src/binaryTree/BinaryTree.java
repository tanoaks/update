package binaryTree;

public class BinaryTree {
	private int rank;
	private Integer key;
	private int value;
	private BinaryTree left;
	private BinaryTree right;
	private BinaryTree node;
	

	public int getvalue()
	{return this.value;}
	
 public BinaryTree get(Integer key)
 {	if(this.key==null)
	 return null;
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
	right=new BinaryTree();
	right.put(key, value);
}
else if(key<this.key){
	left= new BinaryTree();
	left.put(key, value);}
else
	this.value=value;
}
}
