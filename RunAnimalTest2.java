/*
 * ~~ Roy Phelps ~~
 * Animal Gussing Game
 */
package animal2;

import java.util.Scanner;

public class RunAnimalTest2 {

	public static void main(String[] args) {

		// Attributes
		// Boolean variable for while loop to control input
		boolean input = true;	
		String name = null;
		boolean endangered = false;
		String diet = null;
		int holdBreath = 0;
                String color = null;
			
		// Instantiate animal2 object for class purpose
		Animal2 oceanAnimal = null;
			
		// Create scanner object to scan input
		Scanner scn = new Scanner(System.in);
			
		// Loop until get valid values for constructor parameters
		while (input) {
				
		try {
				
		// Prompt for name of Animal2 (String)
		System.out.println("\nEnter an ocean animal name: ");
		name = scn.nextLine();
		name += scn.nextLine();

		// Prompt for if is endangered (boolean)
		System.out.println("Is your animal endangered? ");
		if (!scn.hasNextBoolean() )
			throw new IllegalArgumentException("Not a boolean answer! ");
				endangered = scn.nextBoolean();
				
		// Prompt for type of diet (String)
		System.out.println("What is your animal's type of diet? ");
		diet = scn.nextLine();
		diet += scn.nextLine();
                
                // Promt for color
                System.out.println("What is your anima's color? ");
                color = scn.nextLine();
                
				
		// Prompt for how long can hold breath (int)
		System.out.println("How long can it hold it's breath underwater? ");
		if (!scn.hasNextInt() )
			throw new IllegalArgumentException("Not an int answer! ");
				holdBreath = scn.nextInt();

		// Create instance of Animal2
		   oceanAnimal = new OceanAnimal2(name, endangered, diet, holdBreath, color);	
					
			input = false;	// Set to false if input passes constructor conditions
				
		} catch (IllegalAnimalStringArgumentException e) {
				System.out.println("\nTRY AGAIN! Invalid String: " +
						  e.getMessage() );
				
		// IllegalArgumentException for boolean and int	
		} catch (IllegalArgumentException f) {
				System.out.println("\nTRY AGAIN! Invalid Entry: "
					          + f.getMessage() );
					  
		} 
			
	} 		
		// Display summary
		oceanAnimal.display();	
	} 
	
} 

