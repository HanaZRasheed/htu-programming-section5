package lab9.javaException.checked;

import java.io.IOException;

public class Example7 {

	public static void main(String[] args) {
		ReadFile obj = new ReadFile();
			try {
				obj.readContent();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
