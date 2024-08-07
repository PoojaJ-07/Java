//CapitalCity:name,population:constructor,decalre a method to print details
//state:name,language:constructor ,--->capitalCity ,decalre a method to print details
//Country:name.continent---> state--->CapitalCity,decalre a method to print details----->6/8/2024

class Country
{
	String continent;
	String name;
	State state=new State("Karnataka","Kannada");
	
	Country()
	{
		System.out.println("Created copy constructor in country");
	}
	public void details()
	{
		System.out.println("Country continent:"+this.continent);
		System.out.println("Country name:"+this.name);
		this.state.information();
    }
	
	public static void main(String[] args)
	{
		System.out.println("Running main in Country");
		Country country=new Country();
		country.name="India";
		country.continent="Asia";
		country.details();
	}
}