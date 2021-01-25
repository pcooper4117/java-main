package com.techelevator;

	/** identifies a special type comment know as a JavaDoc (Javadoc) comment
 	* 
	* A JavaDoc can be used to generate standard formatted documentation
 	* and it shows when in intellisense of the IDE
 	* 
 	* May different annotations (@-word) to identify specific components of code
	* 
	* @param
 	* @returns
 	* @author student
 	*
 	* Refer to the Topic in Cohort Google Doc for a link to more than you want to about JavaDoc
 	*
	 */


public class PlayingCard {
	/*********************************************************************************************
	 * static - means there is only copy - shared by all objects
	 * 
	 * No matter how many objects of the class exist there is only one copy of the static data
	 * 
	 * static data exists even if no object of the class have been instantiated
	 * 
	 * non-static variables are referred to as instance variables because they exist for each
	 *            instance of the class
	 *            
	 * static data members can only be changed by static methods.
	 * 
	 * static methods can only refer to static data members
	 * 
	 * static method is one that processes static data
	 * a
	 * static methods may be invoked with any object of the class or class name
	 * 
	 *      System.out.println()   -   System is the class name; out is the object; println() is the method
	 * 
	 *      Integer.parseInt()     -   Integer is the class name; parseInt() is the method
	 ********************************************************************************************/
	// FINAL TELLS JAVA THE VALUE CANNOT BE CHANGED ONCE THE VALUE IS SET
	// USE FINAL TO DEFINE CONSTANTS IN PROGRAMS
	// CONSTANTS ARE DATA VALUES THAT DONT CHANGE
	// CONSTANTS ARE TYPICALY USED IN PLACE OF LITTERALLS
	// JAVA NAMING CONVENTIONS WANTS CONSTANTS TO BE IN ALL UPPERCASE
	//--------------------------------------------------------------------------------------------------------
	// MEMBERS OF A CLASS ARE ASSIGNED ACCESS MODIFIERS WHICH INDICATE WHO OR WHAT HAS ACCESS TO THE MEMBER
	// PUPLIC IS AN ACCESS MODIFIER THAT ANYONE CAN ACCESS THE MEMBER (DATA OR METHOD)
	// PRIVATE ONLY MEMBERS OF THE CLASSS CAN ACCESS THE MEMBER
	/// CONSTANTS DE COUPLE THE CODE -LOOSELY COUPLE
	// USUALLY DATA MEMBERS ARE PRIVATE AND METHODS ARE PUBLIC
	// ENCAPSULATION SAYS WE PROTECT THE DATA FROM OUTSIDE THE CALSS ACESS 
	// WE PRIVED METHODS FOR THOSE OUTSIDE TO ACCESS TO OUR DATA - WE CONTROL ACCES TO OUR DATA
	
	// the keyword .this represents the current object
	// this is the object to the left of the . when a method is invoked : object.method(parameters)
	// in a ctor it is only required when a parameter name is the same as data member
	
	//********************************************************************************************
	// Class member constants  = USE CONSTANT NAMES IN PLACE OF LITERALS TO MAKE EASIER TO READE
	//********************************************************************************************
	private final static int MINVALUE    = 0;             // Minimum valid card value 
	private final  static int MAXVALUE    = 13;            // Maximum valid card value
	private final static int JOKER_VALUE = 0;             // Joker value - No considered valid
	private final static int DEFAULT_VALUE = JOKER_VALUE; // Used if no value provided
		
	//********************************************************************************************	
	// Class member data - attributes of an class object
	//********************************************************************************************
	private String  suit;
	private int     value;   // 0=Joker, 11=Jack, 12=Queen, 13=King
	private String  color;
	private boolean showing;
	private String  shape;   // read-only - no Setter or argument to a constructor
	
//********************************************************************************************
// Constructors for the class
//
// Constructors have the same name as the class have no return type - NOT EVEN void	constructor never has a return
//
// Constructors are frequently overloaded (same name, same behavior,  different parameters)
//              overloading ctors allows users flexibility in defining objects of the class
	
	//  PROVIDE CONSTRUCTORS FOR EACH SCENEARIO YOU ENVISION USERS WILL INSTANCEIATE OBJECTS OF YOUR CLASS
	//
//*********************************************************************************************	
	/**
	 * default constructor - has no parameters
	 */
	public PlayingCard() {  // WHEN USER WANTS AN OBJECT WITH DEFAULT VALUES
		value   = DEFAULT_VALUE;
		suit    = "Clubs";
		showing = false;
		determineColor();         // Use class member method to set the color based on the suit
		shape="Rectangle";
	}
	/**
	 * 4-arg constructor
	 */// USED WHEN USER WANTS TO CREATE AN OBJECT WITH SPICIFIC ATTRIBUTES LIKE VALUE SUIR COLOR AND SHOWING
	public PlayingCard(int value, String suit, String color, boolean showing) {
		setValue(value);          // Use member method to set value in case value passed is invalid
		this.suit    = suit;
		this.showing = showing;
		determineColor();         // Use class member method to set the color based on the suit
		                          //     ignore color sent is as a parameter by user
		shape="Rectangle";
	}
	/**
	 * 2-arg constructor
	 */// WHEN  THE USER WANTS TO CREAT AN OBJECT WITH SPECIFIC ATTRIBUTES - VALUE SUIT
	//     ALL NON SPECIFIED ATTRIBUTES ARE SET TO DEFAULT
		public PlayingCard(int value, String suit) {
			setValue(value);          // Use member method to set value in case value passed is invalid
			this.suit       = suit;
			this.showing    = false;
			determineColor();         // Use class member method to set the color based on the suit
			shape="Rectangle";
		}
//********************************************************************************************
// Getters	
//********************************************************************************************
	/**
	 * @return the PlayingCard suit attribute
	 */
		
	public String getSuit() {
		return suit;
	}
	
	/**
	 * @return the PlayingCard value attribute
	 */
	public int getValue() {
		return value;
	}
	/**
	 * @return the PlayingCard color attribute
	 */
	public String getColor() {
		return color;
	}
	
	/**
	 * @return if the PlayingCard showing or not
	 */
	public boolean isShowing() {
		return showing;
	}
	
	/**
	 * @return the shape attribute of the PlayingCard
	 */
	public String getShape() {
		return shape;
	}

//********************************************************************************************
// Setters	
//********************************************************************************************
	/**
	 * @param suit is the value to set PlayingCard suit attribute
	 * @return void
	 */
	// a method signiture identifies the basic characteristics of a method
	//				the characteristcs of a method : return type of what it returns. void means it returns nothing
	//													name what is used to invoke
	//													
//	access return
//    type type    name   (parameters)
	public void setSuit(String suit) {   // Hi, im setsuit and i return void and receive a string i call suit
		this.suit = suit;
	}
	
	/**
	 * @param value is the the value to set PlayingCard value attribute
	 * <br><br>
	 * If value is outside the valid range of values for a PlayingCard
	 * a default value will be assigned
	 * <br><br>
	 * @return void
	 */
	public void setValue(int value) {
		if (value >= MINVALUE && value <= MAXVALUE) { // Is the value passed in the range for a valid card?
			this.value = value;                       //     Yes - assign it to the value data member
		}
		else {
			this.value = DEFAULT_VALUE;               //     No - assign DEFAULT_VALUE to value data member
			}
	}
	/**
	 * @param color is the the value to set PlayingCard color attribute
	 *        color passed is ignored and actually color is set based on suit
	 * @return void
	 */
	public void setColor(String color) {
		determineColor();               // Use class member method to set the color based on the suit
	}
	/**
	 * @param showing is the the value to set PlayingCard showing attribute
	 * @return void
	 */
	public void setShowing(boolean showing) {
		this.showing = showing;
	}
	
//********************************************************************************************
// Additional member methods
//********************************************************************************************
	/**
	 * Return whether PlayingCard value is what one would consider a face card (value greater than 11)
	 * @return whether card is a face card or not
	 */
	
	public boolean isFaceCard() {
		return (getValue() >= 11);  // use class method to retrieve class data
	}
	/**
	 * Flip card from showing to not showing
	 * @return void
	 */
	
	public void flip() {
		showing = !showing;  // Reverse the current value of showing true to false; false to true 
	}
	// Determine card color based on suit
	// So we control what color is set and can be sure it is correct for the suit
	// private so only members of the class may use it
	
	private void determineColor() { // set the cardColor based on the cardSuit
		if (suit.equals("Spades") 
		 || suit.equals("Clubs")
		 || suit.equals("Joker")) {
			color = "Black";
		} else {
			color = "Red";
		}
	}	
	/**
	 * Display the attributes of a PlayingCard one at a time
	 * @return void
	 */
	// Display the attributes of a PlayingCard 
	public void showCard() {
		System.out.println("      Suit: " + getSuit());
		System.out.println("     Value: " + getValue());
		System.out.println("   Showing: " + showing);
		System.out.println("     Shape: " + shape);
//		System.out.println("-----------------------------------------------------------------------------------");
	}

//********************************************************************************************
// Overrides - Define new behavior that is different than ancestor behavior
//             Overriding methods have same name, same parameters, but different behavior	
//********************************************************************************************

	/**
	 * Construct a String representation of the object
	 * @return String containing the attributes of the object
	 */
	
	@Override             // Ask the compiler to verify this is a proper override
	public String toString() {  // THE DEFAULT TOSTRING() IS THE OBJECT CLASS FOR ALL CLASSES
		// USUALLY THE DFAULT BEHAVIOR OF THE OBJECT CLASS TOsTRING() IS NOT DESIRIABLE
		//SO WE OVERIDE THE OBJECT TOSTRING WITH OUR OWN CLASS
		return "PlayingCard [suit=" + suit + ", value=" + value + ", color=" + color + ", showing=" + showing
				            + "shape=" + shape +"]";
	}
	
	
	// we need to override object class.equals method since the object class has no idea what it means
	// for one playingcard to be equal to another playingcard. since we defined the playingCard class
	public boolean equals(PlayingCard otherCard) {
		//since this is our class we decide what makes one playinCard equal to another playingCard
		// to use this method one would code  aPlayingCard object.equals(aPlayingCardObject)
		// we coded card4.equals (card5)
		//			this			that
		// this always references/ means the object to the left of the. that invokes the method
		if ((this.value == otherCard.value) && (this.suit.equals(otherCard.suit))) {
			return true;
	}
	else {
		return false;
	}
	}
}

