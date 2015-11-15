package redandblack;

public class Tree {

	Tree left;
	Tree right;
	 public boolean colour;
	void flipColour()
	{
		if(left.colour&&right.colour)
		{
			this.colour=true;
		}
	}
	void shiftRight()
	{
		
	}
	void shiftLeft()
	{
		if(!left.colour&&right.colour)
		{
			Tree node;
			node=left;
			left=left.right;
			node.right=this;
			
			
		}
	}
	
	void add()
	{
		
	}
	void get(int a)
	{}
}
