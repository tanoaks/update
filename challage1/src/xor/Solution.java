package xor;

import java.util.Scanner;

public class Solution {
		public static int takemax(int pos)
		{ int max=0;
		while(pos>0)
		{
			pos=pos>>1;
			max++;
		}
			return max;
		}
	  static int maxXor(int l, int r) {
		  int lmax=0;
		  int rmax=0;
		  int ret= 0;
		  lmax=r^l;
		  lmax=takemax(lmax);
		  lmax=(int)Math.pow(2, lmax);
		  lmax--;
//		  lmax=takemax(l);
//		  rmax=takemax(r);
//		  if(lmax==rmax)
//			 rmax--; 
//		  for(int i=0;i<rmax;i++){
//			 
//			 ret=(int)Math.pow(2, i)+ret;
//			 
//		  }
		  
return lmax;

	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int res;
	        int _l;
	        _l = Integer.parseInt(in.nextLine());
	        
	        int _r;
	        _r = Integer.parseInt(in.nextLine());
	        
	        res = maxXor(_l, _r);
	        System.out.println(res);
	        
	    }

}
