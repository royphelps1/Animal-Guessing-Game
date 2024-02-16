/*
 * ~~ Roy Phelps ~~
 * Animal Gussing Game
 */
package animal2;

public class IllegalAnimalStringArgumentException extends IllegalArgumentException {
	
	// Attributes
	private String msg;
	
	public IllegalAnimalStringArgumentException(String name, String diet, String color) {
		if (name == null) 
			msg = "Animal name cannot be null";
		if (name.isBlank() ) 
			msg = "Animal name cannot have blank value";
		if (name.isEmpty() )
			msg = "Animal name cannot be empty value";
		if (diet == null)
			msg = "Diet type cannot be null";
		if (diet.isBlank() ) 
			msg = "Diet cannot have blank value";
		if (diet.isEmpty() ) 
			msg = "Diet cannot be empty value";
                if (color.isEmpty() )
                        msg = "Color cannot be empty value";
                if (color.isBlank() )
                        msg = "Color cannot have blank value";
                if (color == null)
                        msg = "Color name cannot be null";
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + " : " + msg;
	}


}
