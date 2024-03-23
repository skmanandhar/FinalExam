package takeHomeExam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practical2 {
	
	//global scanner object
	static Scanner scan;
	
	public static void main(String[] args) {

		String path = "data\\myFile.txt";
		
		//ArrayList to store lines from the file
		List<String> lines = new ArrayList<String>();
		
		//checking if file exist
		doesFileExist(path);
		
		//read lines from file and store lines in ArrayList
		while(scan.hasNextLine()) {
			lines.add(scan.nextLine());
		}
		
		//read ArrayList
		for (String line : lines) {
			//store position of -
			int i =line.indexOf("-");
			
			//key is word before - 
			String key = line.substring(0,i);
			//values after -
			String values = line.substring(i + 1);
			
			//print key
			System.out.println(key);
			//split values further by ,
			String[] words = values.split(",");
			
			//print splitted values
			for(String word : words) {
				System.out.println(word);
			}
		}
		
		//closing scanner object
		scan.close();
		
	}
	
	public static void doesFileExist(String path) {
		//create a new file 
		File file = new File(path);
	
		//load the file
		//throw exception if file not found
		try {
		
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist");
			e.printStackTrace();
		}
		
	}

}
