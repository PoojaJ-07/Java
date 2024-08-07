class Teju
{
	String email;
	Upi upi;
	
	Teju(String email,Upi upi)
	{
	 System.out.println("Creates constructor using String and upi");	
	    this.email=email;
		this.upi=upi;
		
	}
	public void data()
	{
		System.out.println("email:"+this.email);
		upi.details();
	}
	
	public static void main(String[] args)
	{
		System.out.println("Running main");
		Upi upi=new Upi(9980304492L,"Canara bank");
		Teju teju= new Teju("teju@gmail.com", upi);
		teju.data();
		
		Upi upi1=new Upi(9987894492L,"Kotak bank");
		Teju teju1= new Teju("pooja@gmail.com", upi1);
		teju1.data();
	}
	
}