
//Parameterized constructor   --2/8/2024
// create a copy using each constructor and print the variable after creating


class CoffeePowder{
	
	double cost;
	String company;
    double weight;
	String manufactureDate;
	
	CoffeePowder()
	{
		System.out.println("Created no parameter constructor");
	}
	CoffeePowder(String company)
	{
		this.company=company;
		System.out.println("Created  parameter constructor");
	}
	CoffeePowder( String company,double cost,double weight,String manufactureDate)
	{
		this.company=company;
		this.cost=cost;
		this.weight=weight;
		this.manufactureDate=manufactureDate;
		System.out.println("Created  parameter constructor");
	}
	CoffeePowder( String company,String manufactureDate)	
	{
		this.company=company;
		this.manufactureDate=manufactureDate;
		System.out.println("Created  parameter constructor");
	}
	CoffeePowder(double weight)
	{
		this.weight=weight;
		System.out.println("Created  parameter constructor");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main method running");
		
		CoffeePowder coffeePowder= new CoffeePowder();
		System.out.println("Company:"+coffeePowder.company);
		System.out.println("cost:"+coffeePowder.cost);
		System.out.println("weight:"+coffeePowder.weight);
		System.out.println("manufactureDate:"+coffeePowder.manufactureDate);
		
		CoffeePowder coffeePowder1= new CoffeePowder("Bru",50,250,"3/8/2024");
		System.out.println("Company:"+coffeePowder1.company);
		System.out.println("cost:"+coffeePowder1.cost);
		System.out.println("weight:"+coffeePowder1.weight+"gms");
		System.out.println("manufactureDate:"+coffeePowder1.manufactureDate);
		
		CoffeePowder coffeePowder2= new CoffeePowder("Malgudi","29/7/2024");
		System.out.println("Company:"+coffeePowder2.company);
		System.out.println("manufactureDate:"+coffeePowder2.manufactureDate);
		
		CoffeePowder coffeePowder3= new CoffeePowder(250);
		System.out.println("weight:"+coffeePowder3.weight+"gms");
	}
}