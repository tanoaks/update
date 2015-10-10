package binaryHeap;

public class BinaryHeap {
private int array[];
public BinaryHeap(int size) {
	array= new int[size];
}

public void swim(int i)
{
	while (i>1||array[i]>array[i/2])
	{
		swap(i, i/2);
		i=i/2;
	}
}

public void swap(int i,int j)
{
	
	int temp=0;
	temp=array[i];
	array[i]=array[j];
	array[j]=temp;
	
}
public void sink(int i)
{
	while(i<array.length)
	{
		if(array[i]<array[i*2])
		{
			
			
			
		}
		
		
	}
}
}
