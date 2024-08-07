/*Key: weight,brand--> init this using Const
declare details()
Keybunch ---> material,Key--->init this using Const
declare details()------>7/8/2024 */


class Key{

 double weight;
 String brand;

 Key(double weight,String brand)
 {
	 System.out.println("Creates constructor using double and String");
	 this.weight=weight;
	 this.brand=brand;
 }
 
 public void details()
 {
	 System.out.println("Key weight:"+this.weight+"grms");
	 System.out.println("Key brand name:"+this.brand); 
 }
}