package mergeSort;

public class Basic {
	
	private int arr[];
	private  int out[];
	int n=0;
	
	void printArry()
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+","); //+", a            b  "  + arr[i]    
		System.out.println("");
	}
	
	void input(int a[])
	{
		arr=a;
		out=new int[arr.length];
	}
	
	void sort(int arr[])
	{
		int aux[]=new int[arr.length];
		sort(arr, aux, arr.length-1, 0);
	}
	
	void sort(int arr[],int aux[] ,int high ,int low)
	{	if(high<low||high==0) return;
		int mid =0;
		mid=(high+low)/2+low;
		if(high<=mid||high==low) return;
		sort( arr, aux , mid , low);
		sort( arr, aux, high , mid+1);
		merge( arr, aux , high , low,mid);
	}
	
	void merge(int arr[],int aux[] ,int high ,int low,int mid)
	{	int i=0,j=0;
	for(int arrtemp=0;arrtemp<arr.length;arrtemp++)
		aux[arrtemp]=arr[arrtemp];
	
	j=mid+1;
	i=low;
	
	
	for(int k=low;k<=high;k++)
		{
		{
			 if(i>mid)
					arr[k]=aux[j++];
			 else if(j>high)
			arr[k]=aux[i++];
		
		else if(aux[i]>aux[j]){
			arr[k]=aux[j++];
		}
		else 
		{
			arr[k]=aux[i++];
			
		}		
			
		}
		
			
			//System.out.println(arr[i]+"   "+arr[j]);
			
			}
		//printArry();
	}
		
	}


