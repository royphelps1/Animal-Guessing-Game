/*
 * ~~ Roy Phelps ~~
 * Animal Gussing Game
 */
package animal2;

public class OceanAnimal2 extends Animal2 {

	// Local attributes
	private int holdBreath;
	
	// Constructor
	public OceanAnimal2(String name, boolean endangered, String diet, int holdBreath, String color) {
		super(name, endangered, diet, color);
		this.holdBreath = holdBreath;
	}
	
	// Default constructor inheriting constructor from Animal (overloading)
	public OceanAnimal2() {
		this.holdBreath = 0;
	}
	
	// Getter method 
	public int getHoldBreath() {
		return holdBreath;
	}
	
	public void setHoldBreath(int holdBreath) {
		this.holdBreath = holdBreath;
	}
	public void display() {
		super.display();
		System.out.println("Minutes holding breath: " + holdBreath + ")" );
	}
	
	public void toSwim() {
		System.out.println(getName() + " is swimming. ");
	}
	
	public void toSplash() {
		System.out.println(getName() + " is splashing. ");
	}
	
	// @Overriding method for isSleeping() 
	// Animal superclass.
	public void isSleeping() {
		System.out.println( getName() + " IS ACTUALLY NAPPING! ");
	}
	
	
} // end class

