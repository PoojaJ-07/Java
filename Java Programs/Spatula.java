//Print the literal,RE-Init each instance varibale and print it

class Spatula{

String color="Black";
String size="Medium";
String material="Wood";
double cost=250;

Spatula()
{
System.out.println("Creating copy of spatula");
}
public static void main(String[] args)
{
 System.out.println("start main in spatula");
 Spatula spatula=new Spatula();
 System.out.println("Spatula Color:"+spatula.color);
 System.out.println("Spatula size:"+spatula.size);
 System.out.println("Spatula material:"+spatula.material);
 System.out.println("Spatula Cost:"+spatula.cost);
 
 spatula.color="Green";
 System.out.println("Spatula Color:"+spatula.color);
 spatula.size="Small";
 System.out.println("Spatula size:"+spatula.size);
 spatula.material="Silicon";
 System.out.println("Spatula material:"+spatula.material);
 spatula.cost=300;
 System.out.println("Spatula cost:"+spatula.cost);
}
}