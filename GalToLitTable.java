/*
 *  Try This 1-2
 * 
 * This Program displays a conversion
 * Table of gallons to Liters.
 * 
 * Call This Program "GalToLitTable.java"
*/

class GalToLitTable {
  public static void main(String args[]) {
	final double $LITER_CONST = 3.7854;
	double gallons, liters;
	int counter = 0;
	
	for(gallons = 1; gallons <= 100; gallons++) {
	  	liters = gallons * $LITER_CONST;
	  	System.out.println(gallons + " gallons equals " +
						   liters + " Liters");
		counter++;
		
		// print blank line every 10 lines
		if(counter == 10) {
		 System.out.println();
		 counter = 0;
   }
  }  
 }	
}
