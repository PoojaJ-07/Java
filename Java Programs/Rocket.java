//Rocket: country,speed,fuelCapacity,noOfThrusters

class Rocket
{
 int speed=27000;  //literal
 String country;    //method
 int fuelCapacity;   //ref
 String noOfThrusters;  //const
 
 Rocket(String noOfThrusters)
 {
	 System.out.println("Created constructor");
	 this.noOfThrusters=noOfThrusters;
 }
 public void setCountry(String country)
 {
	 this.country=country;
 }
 public void launch()
 {
	 System.out.println("Rocket speed:"+this.speed);
	 System.out.println("Rocket country:"+this.country);
	 System.out.println("Rocket fuel Capacity:"+this.fuelCapacity);
	 System.out.println("Rocket noOf Thrusters:"+this.noOfThrusters);
 }
 public static void main(String[] args)
 {
	 Rocket rocket = new Rocket("9 Merlin engines");
	 rocket.setCountry("united states");
	 rocket.fuelCapacity=500000;
	 rocket.launch();
	 
	 Rocket rocket1 = new Rocket(" 1 RD-107 engine ");
	 rocket1.setCountry("Russia");
	 rocket1.fuelCapacity=300000;
	 rocket1.launch();
	 
	 Rocket rocket2 = new Rocket(" 5 YF-77 engines");
	 rocket2.setCountry("India");
	 rocket2.fuelCapacity=400000;
	 rocket2.launch(); 
 }
}