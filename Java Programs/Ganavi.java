/*Clip --> color,type --> init this using Const
declare details()
Ganavi---> email,Clip--> init this using Const
declare details()  ------>7/8/2024*/

class Ganavi
{
	String email;
	Clip clip;
	
	Ganavi(String email,Clip clip)
	{
		System.out.println("Created constructor with string and clip");
		this.email=email;
		this.clip=clip;
	}
	
	public void details()
	{
		System.out.println("Ganavi email:"+this.email);
		clip.details();
	}
	public static void main(String[] args)
	{
		System.out.println("Running main");
		Clip clip=new Clip("Pink","Claw clip");
		Ganavi ganavi=new Ganavi("ganavi@gmail.com",clip);
		ganavi.details();
		
		System.out.println("=========================");
		
		Clip clip1=new Clip("Black","Clamps clip");
		Ganavi ganavi1=new Ganavi("ganavi@outlook.com",clip1);
		ganavi1.details();
	}
	
}