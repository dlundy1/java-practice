/* This program converts inches to Meters */

class i2m {
  public static void main(String args[]) {
	final double INCH_METER = 0.025400051;
	double inches, meters;
	byte count = 0;
	
	for(inches = 1; inches <= 144; inches++) {
	  meters = inches * INCH_METER;
	  System.out.println(inches + " inches equals "
						+ meters + " Meters");
	  
	  count++;
	  if(count == 12) {
		System.out.println();
		count = 0;
	  }
		
	}
  }	
}
