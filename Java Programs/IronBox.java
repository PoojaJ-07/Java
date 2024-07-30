//Print the literal,RE-Init each instance varibale and print it

class IronBox{

String brand="Havells";
String coating="Plastic";
int temperature=1000;
double cost=2500;

IronBox()
{
System.out.println("Creating copy of IronBox");
}
public static void main(String[] args)
{
 System.out.println("start main in IronBox");
 IronBox ironBox=new IronBox();
 System.out.println("IronBox brand:"+ironBox.brand);
 System.out.println("IronBox coating:"+ironBox.coating);
 System.out.println("IronBox temperature:"+ironBox.temperature+"W");
 System.out.println("IronBox Cost:"+ironBox.cost);
 
 ironBox.brand="Bajaj";
 System.out.println("IronBox size:"+ironBox.brand);
 ironBox.coating="Stainless steel";
 System.out.println("IronBox coating:"+ironBox.coating);
 ironBox.temperature=1200;
 System.out.println("IronBox temperature:"+ironBox.temperature+"W");
 ironBox.cost=3000;
 System.out.println("IronBox cost:"+ironBox.cost);
}
}