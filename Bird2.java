/*
 * ~~ Roy Phelps ~~
 * Animal Gussing Game
 */
package animal2;

public class Bird2 extends Animal2 {

	// Local attributes
	private int numFeathers;
	private boolean canFly;
	
	// Constructor
	public Bird2(String name, boolean endangered, String diet, int numFeathers, boolean canFly, String color) {
		
		super(name, endangered, diet, color);
		this.numFeathers = numFeathers;
		this.canFly = canFly;
	}
	
	// Default constructor for bird. Inherits Animal 
	// superclass constructor (overloading)
	public Bird2() {
		this.numFeathers = 0;
		this.canFly = false;
	}
	
	// Getter methods
	public int getNumFeathers() {
		return numFeathers;
	}
	
	public boolean getCanFly() {
		return canFly;
	}
	
	// Setter methods
	public void setNumFeathers(int numFeathers) {
		this.numFeathers = numFeathers;
	}
	
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public void display() {
		super.display();
		System.out.println("Avg # of feathers " + numFeathers + ", to Fly or not to Fly: " + canFly + ")" );
	}
	
	// Unique methods
	public void toFly() {
		System.out.println(getName() + " starts to fly. ");
		
	}
	
} // end class
