package methodLearning;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		System.out.print("Give me a number: ");
		
		Scanner scan = new Scanner(System.in);
		int givenN = scan.nextInt();
		
		//for(int i=4; i<=givenN; i=i+4) {
			//System.out.println(i);
		//}
		
		//for(int i = givenN; i>=0; i--  ) {
			//System.out.println(i);
		//}
		
		if( givenN%2==0) {
			System.out.println("Your number is EVEN");
		}
		else {
			System.out.println("Your number is ODD");
		}
			
		
	}

}
