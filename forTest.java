
// Testing the "For Each" Style for Loop

class forTest {
   public static void main(String bunny[]) {
	  int nums[] = {1, 2, 3, 4, 5 ,6, 7, 8, 9, 10};
	  int sum = 0;
	  
	  for(int x: nums) {
		  sum = sum + x;
		  System.out.println("Sum is now: " + sum);
		  if(sum == 10) { System.out.println("Loop Break"); return; }
		 }
	  
	  System.out.println("The sum of the array is: " + sum);
	 }
 }
