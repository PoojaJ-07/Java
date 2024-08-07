//Parameterized constructor   --2/8/2024
// create a copy using each constructor and print the variable after creating


class Perfume
{
String brand;
double price;
double quantity;
double weight;

Perfume()
{
System.out.println("Created no parameter constructor");
}
Perfume(String brand,double price)
{
this.brand=brand;
this.price=price;
System.out.println("Created  parameter constructor");
}
Perfume(String brand,double price,double quantity)
{
this.brand=brand;
this.price=price;
this.quantity=quantity;
System.out.println("Created  parameter constructor");	
}
Perfume(String brand,double price,double quantity,double weight)
{
this.brand=brand;
this.price=price;
this.quantity=quantity;
this.weight=weight;
System.out.println("Created  parameter constructor");	
}
public static void main(String[] args)
{
	System.out.println("start main");
	Perfume perfume=new Perfume();
	System.out.println("Brand:"+perfume.brand);
	System.out.println("price:"+perfume.price);
	System.out.println("quantity:"+perfume.quantity);
	System.out.println("weight:"+perfume.weight);
	
	Perfume perfume1=new Perfume("Fog",250);
	System.out.println("Brand:"+perfume1.brand);
	System.out.println("price:"+perfume1.price);
	
	Perfume perfume2=new Perfume("Blue water",2000,2);
	System.out.println("Brand:"+perfume2.brand);
	System.out.println("price:"+perfume2.price);
	System.out.println("quantity:"+perfume2.quantity);
		
	Perfume perfume3=new Perfume("water girl",900,2,150);
	System.out.println("Brand:"+perfume3.brand);
	System.out.println("price:"+perfume3.price);
	System.out.println("quantity:"+perfume3.quantity);
	System.out.println("weight:"+perfume3.weight+"ml");
}
}
