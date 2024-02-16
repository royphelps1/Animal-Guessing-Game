/*
 * ~~ Roy Phelps ~~
 * Animal Gussing Game
 */
package animal2;

public abstract class Animal2 {
	
	// Attributes
	private String name;
	private boolean isEndangered;
	private String diet;
        private String color;
	
	// Constructor 
	public Animal2(String name, boolean endangered, String diet, String color) {
		
		if (name == null || name.isBlank() || name.isEmpty() || diet == null
			|| diet.isBlank() || diet.isEmpty() || color.isEmpty())
			
			throw new IllegalAnimalStringArgumentException(name,diet,color);
		
			this.name = name;
			this.isEndangered = endangered;
			this.diet = diet;
                        this.color = color;
	}
	
	// Default constructor (added for week 5). *Constructor overloading
		public Animal2() {
			this.name = "Kangaroo";
			this.isEndangered = true;
			this.diet = "Green Grass";
                        this.color = "Grey";
		}	
	
	// Getter methods
	public String getName() {
		return name;
	}
	
	public boolean getIsEndangered() {
		return isEndangered;

	}
	
	public String getDiet() {
		return diet;
	}
	
	
	// Setter methods
	public void setName(String name) {
		this.name = name;
	}

	public void setIsEndangered(boolean endangered) {
		this.isEndangered = endangered;
	}
	
	public void setDiet(String diet) {
		this.diet = diet;
	}
 
	// Methods
	public void toEat() {
		System.out.println( getName() + " is eating. ") ;
	}
	
	public void toDefecate() {
		System.out.println( getName() + " is defecating. ") ;

	}
	
	public void isSleeping() {
		System.out.println( getName() + " is ZZZZZZzzzzzzzzzz..... ");  
	}
	
	public void isGrowing() {
		System.out.println( getName() + " Look at me, I am growing!!! " ); 
	}
	
	public void display() {
		System.out.println("Animal(name: " + getName() + ", Endangered: " + getIsEndangered() +
				   ", Diet: " + getDiet() + ")" );
		
	}
	
} // end abstract class
