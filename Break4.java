
// Using Break with a Label.

class Break4 {
  public static void main(String args[]){
	int num = 0;
	
	outt: { 
	mid:   { 
	inmost: {
			  for(int i = 0; i < 100; i++) {
				System.out.println("i is: " + i);
				if(i <= 5) break outt;
				if(i == 6) break mid;
				if(i == 7) break inmost;
				
				// Won't Display
				System.out.println("Walla Walla Bing Bang"); 
			  }
			  System.out.println("This is inmost End");
		    }
		    System.out.println("This is mid end");
		   } 
		   System.out.println("This is outt End");
		  }
  }
}
