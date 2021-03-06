
// Demonstrate variable-length arguments.
class varArgs {
  // vaTest() uses a vararg.
  static void vaTest(int ... v) {
	System.out.println("Number of args: " + v.length);
	System.out.println("Contents: ");
	
	// Cycles through entire array, Pushing Data.
	for(int i = 0; i < v.length; i++)
	  System.out.println("arg " + i + ": " + v[i]);
	
	System.out.println();
  }
  
  public static void main(String args[]) {
	// Notice how vaTest() can be called with
	// a variable number of arguments.
	
	vaTest(10); // 1 arg
	vaTest(1, 2, 3); // 3 args
	vaTest(); // 0 args
  }
}
