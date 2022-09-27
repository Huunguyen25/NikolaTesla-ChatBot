 

import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class runNikolaTesla
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		NikolaTesla nikolaTesla = new NikolaTesla();
		
		System.out.println (nikolaTesla.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (nikolaTesla.getResponse(statement));
			statement = in.nextLine();
		}
	}

}