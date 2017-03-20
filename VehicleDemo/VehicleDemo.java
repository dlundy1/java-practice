
/* 
 * A program that uses the Vehicle class.
 * Call this file VehicleDemo.java
*/

class Vehicle {
  int passengers; // stores # of passengers
  int fuelcap; // fuel capacity in gallson
  int mpg; // fuel consumption in miles per gallon	
  
  int range() {
    int range = mpg * fuelcap;
    return range;
  }
  
  double fuelNeeded(int miles){
	double x = (double) miles/mpg;
	
	return x;
  }
  
  Vehicle(int p, int f, int m) {
    passengers = p;
    fuelcap = f;
    mpg = m;
  
  }
}

// This class declares an object of type Vehicle.
class VehicleDemo {
  public static void main(String args[]) {
	Vehicle minivan = new Vehicle(7, 16, 21);
	Vehicle sportscar = new Vehicle(2, 14, 12);
	
	int range1, range2;
	int dist = 252; // distance needed to travel
	
	// Output Data
	System.out.println("Minivan can carry " + minivan.passengers
					  + " with range of " + minivan.range() + " Miles");
	System.out.println("Sportscar can carry " + sportscar.passengers
					  + " with range of " + sportscar.range() 
					  + " Miles");
					  
	System.out.println(" To Go " + dist + " miles, Minivan needs "
					  + minivan.fuelNeeded(dist) + " gallons of fuel.");
	System.out.println(" To Go " + dist + " , sportscar needs "
					+ sportscar.fuelNeeded(dist) + " gallons of fuel.");
	
  }
}
