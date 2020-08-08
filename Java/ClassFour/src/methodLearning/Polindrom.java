package methodLearning;

import java.util.Arrays;
import java.util.Scanner;

public class Polindrom {

	public static void main(String[] args) {
		System.out.println("Give me a word: ");
		Scanner uI = new Scanner(System.in);
		String X = uI.nextLine();
		System.out.println("You enered: "+ X);
		
	
		
		char[] CA = X.toCharArray();
		for (int i = CA.length-1 ; i>=0 ; i--) {
		char CB = CA[i];
			System.out.print(CB);
			//System.out.println(CA);
		}
		//boolean compare = Arrays.equals(CA);
		//if (X.equalsIgnoreCase(CB)) {
			
		}
			
			
		}

	


