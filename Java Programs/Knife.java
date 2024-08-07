/*Knife--> weight,height--> init this using Const
declare details() ----->7/8/2024
Ananya---> mobile,Knife --->init this using Const
declare details()*/

class Knife
{
	double weight;
	double height;
	
	Knife(double weight,double height)
	{
		System.out.println("Created constructor");
		this.weight=weight;
		this.height=height;
	}
	public void info()
	{
		System.out.println("Knife weight:"+this.weight+"grams");
		System.out.println("Knife height:"+this.height+"inches");
	}
}