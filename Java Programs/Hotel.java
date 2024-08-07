//Assosition---->6/8/2024
//Owner:name,age,gender:constructor and declare a method to print the details
//Hotel: name:literal,declare a method to print details

class Hotel
{
	String name="Moon Light";
	Owner owner=new Owner("Rohit",35,'M');
	
	Hotel()
	{
		System.out.println("Created constructor in hotel");
	}
	public void opens()
	{
		System.out.println("Hotel Name:"+this.name);
		this.owner.details();
	}
	
	public static void main(String[] args)
	{
		System.out.println("Running main in hotel");
		Hotel hotel= new Hotel();
		hotel.opens();
	}
}