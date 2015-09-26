package challang2;

import java.util.Scanner;

public class Solution {
	public static void growth(int[] in)
	{
		
		for(int i = 0 ;i<in.length;i++)
		{
			int temp = in[i];
			int len=1;
			for(int j=1;j<=temp;j++)
			{
				if(j%2==0)
					len++;
				else
					len=len*2;
				
			}
			System.out.println(len);
		}
	}

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		int testcase = sin.nextInt();
		int cycles[]= new int [testcase];
		for (int i =0;i<testcase;i++)
	{
			cycles[i]=sin.nextInt();
	}
		 growth(cycles);
	}

}
