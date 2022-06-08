package lab9.javaException.checked;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example6 {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\hz-95\\OneDrive\\Desktop\\test.txt");
		BufferedReader br;
		String st;

		FileReader fr;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while ((st = br.readLine()) != null) {
				System.out.println(st);

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}