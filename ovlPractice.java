
// Practice Overloading

class Overload {
  int add(int a) {
	 return a;
  }
  
  int add(int a, int b) {
	 return a + b;
  }
  
  int add(int a, int b, int c) {
	 return a + b + c;
  }
}

class ovlPractice {
   public static void main(String args[]) {
	  Overload object;
	  object = new Overload();
	  
	  System.out.println("object.add(1): " 
						+ object.add(1));
	  System.out.println("Object.add(4, 22): " 
						+ object.add(4,22));
	  System.out.println("Object.add(12, 554, 2234): " 
						+ object.add(12, 554, 2234));
   }
}
