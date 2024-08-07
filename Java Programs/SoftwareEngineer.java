//SoftwareEngineer:name,experience,designation,salary:constructor----->6/8/2024

class SoftwareEngineer
{
	String name;
	double experience;
	String designation;
	double salary;
	
	SoftwareEngineer(String name,double experience,String designation,double salary)
	{
		System.out.println("Created constructor in SoftwareEngineer");
		this.name= name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	public void work()
	{
		System.out.println("Software Engineer Name:"+this.name);
		System.out.println("Software Engineer experience:"+this.experience+"Years");
		System.out.println("Software Engineer designation:"+this.designation);
		System.out.println("Software Engineer salary:"+this.salary+"LPA");
	}
	
}