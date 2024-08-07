//Assosition---->6/8/2024
//Owner:name,age,gender:constructor and declare a method to print the details

class Owner{
	String name;
	int age;
	char gender;
	
	Owner(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
		System.out.println("Created constructor in Owner");
	}
	public void details()
	{
		System.out.println("Own Name:"+this.name);
        System.out.println("Own age:"+this.age);
		System.out.println("Own gender:"+this.gender);	
	}

}