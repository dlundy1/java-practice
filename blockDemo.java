/*
 * Demonstrates a block of Code.
 * Call this file blockDemo.java
*/

class blockDemo {
  public static void main(String args[]) {
	double i, j, d;
	String msg;
	
	i = 0;
	j = 10;
	
	// the target of this 'IF' statement is a block.
	if(i != 0) {
	  msg = "i does NOT equal zero.";
	  System.out.println(msg);
	  d = j / i;
	  System.out.println("j / i is: " + d);
	}
	else {
	  msg = "undefined.";
	  System.out.println();
	  System.out.println(msg);
	  System.out.println();
	}
  }
}
