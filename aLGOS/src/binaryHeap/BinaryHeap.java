package binaryHeap;

public class BinaryHeap {
private int array[];
private int end;
public BinaryHeap(int size,int end) {
	array= new int[size];
	this.end =end;
}

public void print()
{for(int i=0;i<array.length;i++)
	System.out.print(array[i]+",");}

public void add(int i){
	
	array[end]=i;
	swim(end);
	end++;
}

public void remove(int i)
{
	swap(i, end-1);
	array[end-1]=0;
	end--;
	sink(i);
	
	
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
	while(i<(end+1)/2) 
	{
		if(array[i]<array[i*2])
		{
		if(array[i]<array[i*2+1])	
		{
			if(array[2]<array[i*2+1])
			{
				swap(i*2+1, i);
			}
			else 
			{ 
				swap(i*2, i);
			}
			i=i*2;
		}
		else 
		{
			swap(i*2,i);
			i=i*2;
		}}
		else 
			if(array[i]<array[i*2+1])
			{
			if(array[i]<array[i*2])	
			{
				if(array[2]<array[i*2+1])
				{
					swap(i*2+1, i);
				}
				else 
				{ 
					swap(i*2, i);
				}
				i=i*2;
			}
			else 
			{
				swap(i*2+1,i);
				i=i*2;
			}
		}
			else
			{break;}
		 
		
	}
}
}
