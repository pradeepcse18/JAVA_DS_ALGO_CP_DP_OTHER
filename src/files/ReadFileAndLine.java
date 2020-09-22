package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadFileAndLine {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader=new BufferedReader(new FileReader
				(new File("H:\\Coding.txt")));
		int count=0;
		String str=null;
		while( (str=bufferedReader.readLine())!=null) {
			count++;
			System.out.println(str);
		}
		System.out.println("Total Line: "+count);
	}
}
