/*
 * This program illustrates the differences
 * between 'int' values and 'double' values
*/

class example3 {
  public static void main(String args[]) {
	int var; // this declares an 'int' variable.
	float z; // this delcares a float variable
	double x; // this declares a floating-point variable.  
	
	var = 10; // assigns value '10' to var.
	x = 10.0;
	z = 10;
	
	System.out.println("Original value of var: " + var);
	System.out.println("Original value of x: " + x);
	System.out.println("Original value of z: " + z);
	System.out.println(); // prints blank line.
	
	// now, divide both by 4
	var = var / 3;
	x = x / 3;
	z = z/ 3;
	
	System.out.println("var after division: " + var);
	System.out.println("x after division: " + x);
	System.out.println("z after division: " + z);
  }
}
