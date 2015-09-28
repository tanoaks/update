package linkedList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestLinkedList {

	public static void main(String[] args) throws IOException {
		File inp= new File("listin.txt");
		try {
			FileReader fileReader = new FileReader(inp);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String a;
			int count=0;
			Linkedlist linkedlist = new Linkedlist();
			while((a=bufferedReader.readLine())!=null)
			{
				linkedlist=linkedlist.push(a);
				count++;
			}
			
			bufferedReader.close();
			for(int i=0;i<count;i++)
			linkedlist=linkedlist.pop();
			 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
