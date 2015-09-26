package challage1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
	static int lonelyinteger(int[] a) {
	List<Integer> alist = new ArrayList<>();
	for(int t=0;t<a.length;t++)
	{
		alist.add((int)a[t]);
	}
	Collections.sort(alist);
	String s = alist.toString();
	System.out.println(s);
		return 0;

		    }
		public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);
		        int res;
		        
		        int _a_size = Integer.parseInt(in.nextLine());
		        int[] _a = new int[_a_size];
		        int _a_item;
		        String next = in.nextLine();
		        String[] next_split = next.split(" ");
		        
		        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
		            _a_item = Integer.parseInt(next_split[_a_i]);
		            _a[_a_i] = _a_item;
		        }
		        
		        res = lonelyinteger(_a);
		        System.out.println(res);
		        
		    }
}
