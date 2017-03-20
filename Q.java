/*
 * Try This 5-2
 * A queue class for characters
*/

class Queue {
  private char q[];
  private int putloc, getloc;
  int size = 10;
  
  Queue() {
    q = new char[size];
    putloc = getloc = 0; 
  }
  
  void put(char ch) {
	 if(putloc == q.length) {
		 System.out.println(" -- Queue is FULL.");
		 return;
		}
	 q[putloc++] = ch;
	}
}

class Q {
	public static void main(String args[]) {
	  Queue ob = new Queue();
	  	
	 }
}
