/*
 * This Program calculates A Person's Weight
 * According to the gravitation Pull of the Moon
 * 
 * Call This Program 'moonWeight.java'
*/

class moon {
 private double eWeight, mWeight;

 double calcWeight(double ei) {
   mWeight = ei * .17;
   return mWeight;
 }
}
class moonWeight {
  public static void main(String args[]){
	 moon ob;
	 ob = new moon();
	
	System.out.println("moon weight is " + ob.calcWeight(250));
	  
  }
}
