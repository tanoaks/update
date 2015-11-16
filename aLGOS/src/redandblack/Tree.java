package redandblack;

public class Tree {
	public int value;
	public int key;
	Tree left;
	Tree right;
	 public boolean colour;
	 
	 public Tree(int key,int value,boolean colour) {
		this.value=value;
		this.key=key;
		colour=this.colour;
	}
	void flipColour(Tree h)
	{
		
			h.colour=true;
			h.left.colour=false;
			h.right.colour=false;
					
	
	}
	Tree shiftRight(Tree h)
	{
		
		Tree node;
		node=h.left;
		h.left=node.right;
		node.right=h;
		
		return node;
	}
	Tree shiftLeft(Tree h)
	{
		
			Tree node;
			node=h.right;
		h.right=	node.left;
			node.left=h;
			
		return node;
	}
	
	  Tree put(Tree h,int key ,int val)
	{
		 if(h==null) return new Tree(key,val,true);
		 if(key>h.key)
		 {
			 put(h.right, key, val);
		 }
		if(key<h.key)
		{
			put(h.left, key, val);
		}
		else 
		{
		h.value=val;	
		}
		  
		
		
		
	return 	 h;
	}
	void get(int a)
	{}
}
