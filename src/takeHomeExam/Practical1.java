package takeHomeExam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practical1 {
	
public static void main(String[] args) {
	
	//variable to hold 500 numbers
	int[] randomNumber = new int[500];
	
	System.out.println("Generating 500 random numbers...");
	
	//generating and storing 500 numbers
	for (int i = 0; i < 500; i++) {
		randomNumber[i] = generateRandomNumber(0,10000);
	}
		
	//sorting the array
	Arrays.sort(randomNumber);
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter a position number: ");
	int n = scan.nextInt();
		
	System.out.println("Position " + n + " : " + randomNumber[n-1]);
	scan.close();	
}

public static int generateRandomNumber(int min, int max) {

	Random random = new Random();
	
	return random.nextInt(max - min) + min ;
	
}
public static int generateRandomNumber() {
	
	Random random = new Random();
	
	return random.nextInt();
	
}

}
