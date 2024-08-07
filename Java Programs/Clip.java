/*Clip --> color,type --> init this using Const
declare details()
Ganavi---> email,Clip--> init this using Const
declare details()*/

class Clip
{
	String color;
	String type;
	
	Clip(String color,String type)
	{
		System.out.println("Created constructor with string,string");
		this.color=color;
		this.type=type;
	}
	public void details()
	{
	   System.out.println("Clip color:"+this.color);
	   System.out.println("Clip type:"+this.type);
	}
	
}