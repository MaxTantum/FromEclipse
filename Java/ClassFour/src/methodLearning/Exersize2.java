package methodLearning;

import java.util.Scanner;

public class Exersize2 {

	public static void main(String[] args) {
		System.out.print("Give the number: ");
		Scanner sc = new Scanner(System.in);
		int uI = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i<= uI;i++){
			
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
