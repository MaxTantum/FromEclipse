package methodLearning;

import java.util.Scanner;

public class IfandElse {

	public static void main(String[] args) {
		
		System.out.println("Enter a day of the week: ");
		Scanner ui = new Scanner(System.in);
		String data = ui.next();
		System.out.println(data);
		
		if(data.equalsIgnoreCase("monday") )
			System.out.println("Go to work");
			
		else if (data.equalsIgnoreCase("tuesday")) 
		System.out.println("Go to work");
		
		else if (data.equalsIgnoreCase("wednesday")) 
			System.out.println("Go to work");
		
		else if (data.equalsIgnoreCase("thursday")) 
			System.out.println("Go to work");
		
		else if (data.equalsIgnoreCase("friday")) 
			System.out.println("Go to work");
		
		else if (data.equalsIgnoreCase("saturday")) 
			System.out.println("Get rest");
		
		else if (data.equalsIgnoreCase("sunday")) 
			System.out.println("Get rest");
		
	}

}
