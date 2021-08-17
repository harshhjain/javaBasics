/*Design and implement chemical elements

The periodic table of chemical elements classifies and displays all chemical elements. Each chemical element has a unique symbolic name and atomic number (number of protons). Chemcial elements are grouped together by common characteristics (alkali metal, poor metal, ...) called the chemical series.

Examples of chemical elements:

H : Hydrogen with atomic number 1.
O : Oxygen with atomic number 8.
K: Potassium with atomic number 19. It is an alkali metal.
Zn: Zinc with atomic number 30. It is a transition metal.
Ga: Gallium with atomic number 31. It is a metal.
We consider the following chemical series:

Alkali metals are all chemical element with atomic number 3, 11, 19, 37, 55, or 87
Transition metals are all chemical elements with atomic number from 21 to 31, 39 to 48, 72 to 80, and 104 to 112.
Metals are all chemical elements with atomic number 13, 49, 50, 81, 82, 83, 113, 114, 115, or 116.

Design and implement a class ChemicalElement. It should hold data about its atomicNumber, symbolicName and its fullName.
Let the class have the following methods : isAlkaliMetal,isTransitionMetal and isMetal , each method returns a boolean based on the atomicNumber of that element.
Also create a class ChemicalElementApp with a main where you create a few instances of ChememicalElement and test the behaviour of the methods.

2. Reuse the ChemicalElement class from exercise 1, introduce an 'equals' method to meaningfully compare 2 instances of ChemicalElement. Here is the signature of the equals method :
public boolean equals(Object o)
First type cast the parameter to ChemicalElement type using 
ChemicalElement other = (ChemicalElement) o;
More about typecasting later.
On what parameter do you do the comparison?
Change the main of ChemicalElementApp class to demonstrate difference between reference comparison and object comparison.

3. Reuse the ChemicalElement class. Design a constructor to accept atomicNumber,symbolicName and fullName as parameters to assign to the fields
Change the ChemicalElementApp class accordingly
4. Reuse the ChemicalElement class. Rewrite the three instance methods of the class.
Implement these three methods without if or else, but

one method with a switch
one method with a single boolean expression
one method with a static boolean-array where the index is the atomic number. Why am I suggesting to make that array static?
 You can initialize the array in the static initializer of the class ( static { ... } ).
*/


public class ChemicalElement {
	
	int atomicNumber;
	String name;
	String symbol;
	
	static boolean[] alkaliMetals = new boolean[120];
	
	static {
		alkaliMetals[3] = true;
		alkaliMetals[11] = true;
		alkaliMetals[19] = true;
		alkaliMetals[37] = true;
		alkaliMetals[55] = true;
		alkaliMetals[87] = true;
	}
	
	public ChemicalElement(int atomicNumber,String name,String symbol) {
		this.atomicNumber = atomicNumber;
		this.name = name;
		this.symbol = symbol;
		
		
	}
	
	public boolean isAlkaliMetal() {
		
		return alkaliMetals[atomicNumber];
	}
	public boolean isTransitionMetal() {
		return false;
	}
	public boolean isMetal() {
		return false;
	}

}


