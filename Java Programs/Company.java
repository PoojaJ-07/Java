//SoftwareEngineer:name,experience,designation,salary:constructor----->6/8/2024
//Company:id,name,loaction:constructor----->softwareEngineer
//declare a method to print details

class Company
{
	String id;
	String name;
	String location;
	SoftwareEngineer softwareEngineer=new SoftwareEngineer("Sushma",3,"Project Engineer",12.5);
	
	Company(String id,String name,String location)
	{
		System.out.println("Created constructor in Company");
		this.id=id;
		this.name=name;
		this.location=location;
	}
	public void details()
	{
		System.out.println("company Name:"+this.name);
		System.out.println("company id:"+this.id);
        System.out.println("company Location:"+this.location);
		this.softwareEngineer.work();
		
	}
	public static void main(String[] main)
	{
		System.out.println("Running Main in company");
		Company company=new Company("U12KA2020PTC123","Wipro","Bengaluru");
		company.details();
	}
}