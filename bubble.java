
/* 
 * 	Try This 5-1
 * 
 *  Demonstrate the Bubble Sort Algorithm.
*/

class bubble {
  public static void main(String args[]) {
	int nums[] = {99, -10, 100123, 18, -978, 
				 5623, 463, -9, 287, 49, 33, 79, -3234, 
				 329, 32, 1, 34, 32, 2, 3, 55, 3, 21, 345, 23};
				 
	int a, b; // Will Control Loops
	int jar; // Will store temporary values
	a = b = jar = 0;
	
	int size; // Size of Array
	size = nums.length;
	 
   // Displays Original Array
   System.out.println("Array is: ");
   for(int i = 0; i < size; i++)
      System.out.println(nums[i]);

   // This is the 'bubble' sort Algorithm
   for(a = 0; a < size - 1; a++)
     for( b = size - 1; b > a; b--)
		 if(nums[b-1] > nums[b]) { // If out of Order
			 jar = nums[b-1]; // swap elements.
			 nums[b-1] = nums[b];
			 nums[b] = jar;
		   }

	// Displays Sorted Array
	System.out.println("Sorted Array: ");
	for(int i = 0; i < size; i++)
		System.out.println(nums[i]);
	
	  
 }
}
