
// Demonstrate a 2D Array.

class twoD {
  public static void main(String args[]) {
	int[][] table;
	table = new int[3][4];
	
	for(int t = 0; t < 3; t++) {
	  for(int i = 0; i < 4; i++) {
		  table[t][i] = (t*4) + i + 1;
		  System.out.print(table[t][i] + " ");
		 }	
		 System.out.println();
		
    }  
  }
}
