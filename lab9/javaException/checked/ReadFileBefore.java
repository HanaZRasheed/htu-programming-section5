package lab9.javaException.checked;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBefore {

	File file = new File("C:\\Users\\hz-95\\OneDrive\\Desktop\\test.txt");
	BufferedReader br;
	String st;

	public void readContent() throws IOException {
		FileReader fr=new FileReader(file);
		br = new BufferedReader(fr);
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}
	}
}
