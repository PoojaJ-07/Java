//CapitalCity:name,population:constructor,decalre a method to print details
//state:name,language:constructor ,--->capitalCity ,decalre a method to print details
//Country:name.continent---> state--->CapitalCity,decalre a method to print details----->6/8/2024


class CapitalCity
{
	String name;
	int population;
	
	CapitalCity(String name,int population)
	{
		System.out.println("Created copy in capital city");
		this.name=name;
		this.population=population;
	}
	public void data()
	{
		System.out.println("Capital City name:"+this.name);
		System.out.println("Capital City population:"+this.population);
	}
}