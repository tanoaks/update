package arraylinklist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestLinkedList {

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws IOException {
		File inp= new File("listint.txt");
		try {
			FileReader fileReader = new FileReader(inp);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String a;
			int count=0;
			LinkedList linkedlist = new LinkedList(10);
			while((a=bufferedReader.readLine())!=null)
			{
				linkedlist.push((a));
				count++;
			}
			
			bufferedReader.close();
			for(int i=0;i<count;i++)
			System.out.println(linkedlist.pop());
			 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
	}
}
