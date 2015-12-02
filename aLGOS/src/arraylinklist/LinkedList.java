package arraylinklist;

import java.util.Iterator;

public class LinkedList<Item> implements Iterable<Item> {

	private Item array[];
	private int pointer;
	private int size;
	
	@SuppressWarnings("unchecked")
	public LinkedList(int a) {
		size=a;
		array=(Item[])new Object[size];
	}
	
	//hi
	@SuppressWarnings("unchecked")
	void push(Item a)
	{
		array[pointer]=a;
		pointer++;
		if(pointer>size*0.75)
			
		{
			size=size*2;
			Item temp[]= (Item[])new Object[size];
			for(int i=0;i<pointer;i++)
			{
				temp[i]=array[i];
			}
			array=temp;
		}
	}
	
	@SuppressWarnings("unchecked")
	Item pop()
	{	Item temp=array[pointer];
	
	if(pointer<=size/2)
	{
		size=size/2;
		Item temp2[]= (Item[])new Object[size+1];
		for(int i=0;i<pointer;i++)
		{
			temp2[i]=array[i];
		}
		array=temp2;
		
		
	}
	array[pointer]=null;
	pointer--;
	
		return temp;
	}


	@Override
	public Iterator<Item> iterator() {
	
		return null;
	}
}
