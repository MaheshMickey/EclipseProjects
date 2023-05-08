package q9trywithresource;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class TrywithResource {

	public static void print() throws FileNotFoundException, IOException {
		try (FileReader fr = new FileReader("input.txt");
				BufferedReader bbr = new BufferedReader(fr)){
			System.out.println(bbr.readLine());
				}
		finally {
			System.out.println("Success");
			//System.out.println(bbr.readLine())
		}
	}
	
	public static void main(String[] args)
	{
		try {
			print();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("e");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("P");
		}
	}

}
