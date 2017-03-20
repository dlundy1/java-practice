/* Try This 1-1
 * 
 * This Program converts gallons to Liters.
 * Call this program GalToLit.java 
 * 
*/

class GalToLit {
  public static void main(String args[]) {
	final double LITER_CONST = 3.7854; // declares Liter const for Conversion
	double gallons, liters;
	gallons = 10;
	liters = gallons * LITER_CONST; // converts to Liters
	
	System.out.println( gallons + " gallons equals " 
						+ liters + " Liters");
  }
}
