//Print the literal,RE-Init each instance varibale and print it

class Wallet{

String color="Brown";
String brand="Urban Forest";
String material="Leather";
double cost=2500;

Wallet()
{
System.out.println("Creating copy of Wallet");
}
public static void main(String[] args)
{
 System.out.println("start main in Wallet");
 Wallet wallet=new Wallet();
 System.out.println("Wallet Color:"+wallet.color);
 System.out.println("Wallet Brand:"+wallet.brand);
 System.out.println("Wallet material:"+wallet.material);
 System.out.println("Wallet Cost:"+wallet.cost);
 
 wallet.color="Rust";
 System.out.println("Wallet Color:"+wallet.color);
 
 wallet.brand="London Alley";
 System.out.println("Wallet Brand:"+wallet.brand);
 
 wallet.material="Leather RFID";
 System.out.println("Wallet material:"+wallet.material);
 
 wallet.cost=3000;
 System.out.println("Wallet cost:"+wallet.cost);
}
}