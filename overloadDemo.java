
// Demonstrate Method Overloading.

class Overload {
   void ovlDemo() {
	  System.out.println("No Parameters");
   }
   
   void ovlDemo(int a) {
	  System.out.println("One Parameter: " + a);
   }
   
   int ovlDemo(int a, int b) {
	  System.out.println("Two Parameters: " + a + " and " + b);
	  return a + b;
   }
   
   double ovlDemo(double a, double b) {
	  System.out.println("Two Double parameters: " + a + " " + b);
	  return a + b;
	}
}

class overloadDemo {
   public static void main(String args[]){
	  Overload ob = new Overload();
	  int resultI;
	  double resultD;
	  
   // call all version of ovlDemo()
   ob.ovlDemo();
   System.out.println();
   
   ob.ovlDemo(2);
   System.out.println();
   
   resultI = ob.ovlDemo(4,6);
   System.out.println("Result of ob.ovlDemo(4,6): " + resultI);
   System.out.println();
   
   resultD = ob.ovlDemo(1.1,2.32);
   System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + resultD);
   System.out.println();
   }
}
