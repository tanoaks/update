package mergeSort;

public class Basic {
	
	private int arr[];
	private  int out[];
	int n=0;
	
	void printArry()
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(out[i]); //+", a            b  "  + arr[i]    
		System.out.println("");
	}
	
	void input(int a[])
	{
		arr=a;
		out=new int[arr.length];
	}
	
	void totalMerge()
	{
		
		
	}
	
	void merge(int high ,int low)
	{	int i=0,j=0,k=0;
	
	int mid=(high+low)/2+1;
	j=mid;
	i=low;
	k=low;
	n=high-low;
	if(n>2){
		//System.out.println(n);
	merge(mid,low);
	merge(high,mid);}
	while(k<=n)
		{
		if(n>2){
		if(j>high)
			out[k++]=arr[i++];
		else if(i>mid)
			out[k++]=arr[j++];
		else if(arr[i]>arr[j]){
			out[k++]=arr[j++];
		}
		else if(arr[i]<arr[j])
		{
			out[k++]=arr[i++];
			
		}		
			
		}
		else
			{if(arr[i]>arr[j])
				{out[i]=arr[j];
				out[j]=arr[i];
				}
			else
			{
				out[i]=arr[i];
				out[j]=arr[j];}
			System.out.println(arr[i]+"   "+arr[j]);
			break;
			}
		printArry();}
		
	}

}
