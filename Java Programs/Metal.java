//Parameterized constructor   --2/8/2024
// create a copy using each constructor and print the variable after creating


class Metal{
	
	String name;
	double cost;
	
	Metal()
	{
		System.out.println("Created no parameter constructor");
	}
	Metal(String name)
	{
		this.name=name;
		System.out.println("Created copy of Metal using string constructor");
	}
	Metal(double cost)
	{
		this.cost=cost;
		System.out.println("Created copy of Metal using double constructor");
	}
	Metal(String name,double cost)
	{
		this.name=name;
		this.cost=cost;
		System.out.println("Created copy of Metal using string,double constructor");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Start main in metal");
		Metal metal=new Metal();
		System.out.println("Metal name:"+metal.name);
		System.out.println("Metal cost:"+metal.cost);
		
		Metal metal1=new Metal("Platinum");
		System.out.println("Metal name:"+metal1.name);
		
		Metal metal2=new Metal(15000);
		System.out.println("Metal cost:"+metal2.cost);
		
		Metal metal3=new Metal("Gold",6400);
		System.out.println("Metal name:"+metal3.name);
		System.out.println("Metal cost:"+metal3.cost);
	}
}