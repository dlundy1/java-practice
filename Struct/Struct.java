class person {
 private String name;
 private int age;
 private int year;
 
 String getName() { return name; }
 int getAge() { return age; }
 int getYear() { return year; }

 person(String n, int a, int y) {
   name = n;
   age = a;
   year = y;
 }
}

class Struct  {
 public static void main(String argsp[]) {
 person ob1 = new person("Deon", 23, 1992);
 person ob2 = new person("Jayla", 28, 1986);
 
 System.out.println(ob1.getName() + " is " + ob1.getAge() 
				   + " years old: " + ob1.getYear());
 System.out.println(ob2.getName() + " is " + ob2.getAge()
				   + " years old: " + ob2.getYear());
 }
}
