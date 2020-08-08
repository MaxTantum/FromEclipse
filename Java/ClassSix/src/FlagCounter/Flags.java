package FlagCounter;

import java.util.Scanner;

public class Flags {

	public static void main(String[] args) {
		
		System.out.print("Give me a positive int: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int count = 0;
		boolean flag = false;
		for(int i = 1; i <=100; i++) {
			
			if (i % number == 0) {
				count++;
				System.out.println( i + " : " + count );
				if (count >= 25) {
					System.out.println("Overflow");
					flag = true;
					//break;
				}
		
			}
			
			if(flag) {
				printStar(2);
			}
			
		}
		System.out.println("Total count = " + count);

	}
	
	public static void  printStar(int num) {
		
		for (int i = 0; i < num ;i++) { 
			System.out.println("*");
		}
	}

}
