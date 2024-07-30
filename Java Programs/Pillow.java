//Print the literal,RE-Init each instance varibale and print it

class Pillow{

String color="White";
String size="Large";
String shape="Round";
double cost=150;

Pillow()
{
System.out.println("Creating copy of Pillow");
}
public static void main(String[] args)
{
 System.out.println("start main in Pillow");
 Pillow pillow=new Pillow();
 System.out.println("Pillow Color:"+pillow.color);
 System.out.println("Pillow size:"+pillow.size);
 System.out.println("Pillow shape:"+pillow.shape);
 System.out.println("Pillow Cost:"+pillow.cost);
 
 pillow.color="Red";
 System.out.println("Pillow Color:"+pillow.color);
 pillow.size="Small";
 System.out.println("Pillow size:"+pillow.size);
 pillow.shape="Square";
 System.out.println("Pillow shape:"+pillow.shape);
 pillow.cost=300;
 System.out.println("Pillow Cost:"+pillow.cost);
}
}