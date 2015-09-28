package unionFind;

public class UnionFind {

	public int ref[];
	public int sz[];
	
	public UnionFind(int a) {
		ref=new int[a];
		sz= new int[a];
	}
	void union(int p, int c)
	{
		ref[c]=p;
		
		
	}
	
	
	int find(int p)
	{
	while(ref[p]!=p)
	{	
		ref[p]=ref[ref[p]];
		p=ref[p];
	}	
	return p;
	}
	
	
	boolean match(int p,int q)
{	if(find(p)==find(q))
	return true;
	else
		return false;
		
}
	
	void quickFindInt()
	{
		for(int i=0;i<ref.length;i++)
			
			ref[i]=i;
	}
	
	void unionAdvance(int p, int c)
	{	
		if(sz[c]>sz[p])
		{	ref[find(c)]=find(p);
		sz[c]+=sz[p];
		}
		else
		{
			ref[find(p)]=find(c);
			sz[p]+=sz[c];
			
		}
		}
		
	}

