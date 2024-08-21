/*Knife--> weight,height--> init this using Const
declare details() ----->7/8/2024
Ananya---> mobile,Knife --->init this using Const
declare details()*/


class Ananya
{
	long mobileNo;
	Knife knife;
	
	Ananya(long mobileNo,Knife knife)
	{
		System.out.println("Created constructor using long,knife");
		this.mobileNo=mobileNo;
		this.knife=knife;
	}
	public void details()
	{
		System.out.println("Ananya Mobile number:"+this.mobileNo);
		knife.info();
	}
	
	public static void main(String[] args)
	{
		System.out.println("Running main");
		Knife knife= new Knife(300,11);
		Ananya ananya=new Ananya(6789509876L,knife);
		ananya.details();
		
		System.out.println("=====================");
		
		Knife knife1=new Knife(350,12);
		Ananya ananya1=new Ananya(9877652493L,knife1);
		ananya1.details();

	}
}