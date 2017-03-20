
/* 
 * Try This 4-2
 * Demonstrate garbage colleciton and the finalize() method.
*/

class FDemo {
  int x;
  
  FDemo(int i){
	x = i;
  }

// called when the object is recycled
protected void finalize() {
  System.out.println("Finalizing..." + x);	
 }

// generates an object that is immediately destroyed.
void generator(int i) {
  FDemo o = new FDemo(i);
 }
}

class Finalize {
  public static void main(String args[]) {
	int count;
	
	FDemo ob = new FDemo(0);
	/* Now, generate a large number of objects.
	 * At some point, garbage collection will occur.
	 * NOTE: you might need to increase the number of
	 * objects generated in order to force garbage colleciton
	*/
  for(count = 1; count < 100000; count ++)
	ob.generator(count);
  }
}
