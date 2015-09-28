package unionFind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestUnionFind {

	public static void main(String[] args) {
	//	Scanner s = new Scanner(System.in);
		int size=0;
		File f = new File("in.txt");
		FileReader fileReader;
		
		
		
		try {
			fileReader = new FileReader(f);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String fistline;
			fistline=bufferedReader.readLine();
			if(fistline.split(",")[0].equalsIgnoreCase("START"))
				size=Integer.parseInt(fistline.split(",")[1]);
			UnionFind uf = new UnionFind(size);
			String filein=null;
			int a=0;
			uf.quickFindInt();
			while((filein=bufferedReader.readLine())!=null)
			{	
				a++;
			
		
				String splt[]=filein.split(",");
				
				if(splt[0].equalsIgnoreCase("End"))
					break;
				
				int p=(Integer.parseInt(splt[0]));
				int q=(Integer.parseInt(splt[1]));
				
//				uf.union(p, q);
				
				uf.unionAdvance(p, q);
				//System.out.println(a);
				
				
				
			}
			
			
			
			
			
		/*	for(int a =0;s.hasNextLine()!=false;a++)
			{
				if(a>8)
					break;
				String string= s.nextLine();
				String splt[]=string.split(",");
				int p=(Integer.parseInt(splt[0]));
				int q=(Integer.parseInt(splt[1]));
				
				uf.union(p, q);
				System.out.println(a);
				
			}
			s.close();*/
			bufferedReader.close();
			for(int i=0;i<size;i++)
			System.out.println(uf.ref[i]);
			System.out.println(uf.match(0, 1));System.out.println(uf.match(4, 3));
		
		
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
