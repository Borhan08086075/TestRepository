package dataTypes;

public class ElseIfDemo {

	public static void main(String[] args) {

	/* Else if syntax:
	 * 
	 * if (condition)
	 * { code to be executed
	 * } else if (condition)
	 * {
	 * Code to be executed
	 * } else
	 * {
	 * code to be executed
	 * }
	 * 
	 */
	int age = 16;
	
	if (age >=18 && age <= 80) {
		System.out.println("It is high time to get married");
	}
	else if (age > 80 && age >= 129)
	{
		System.out.println("Pray to God that are in good health");
	}
	else
	{
		System.out.println("You are so young, Wait for a while");
	}
	
	}
		
}


