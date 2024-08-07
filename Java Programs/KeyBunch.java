/*Key: weight,brand--> init this using Const
declare details()
Keybunch ---> material,Key--->init this using Const
declare details()------>7/8/2024 */


class KeyBunch
{
String material;
Key key;


KeyBunch(String material,Key key)
{
    System.out.println("Created constructor using string kry");
    this.material=material;
	this.key=key;

}
public void data()
{
	System.out.println("Keybunch material:"+this.material);
	key.details();
}

public static void main(String[] args)
{
	System.out.println("Running main");
	Key key=new Key(60,"Europa");
	KeyBunch keyBunch=new KeyBunch("Steel",key);
	keyBunch.data();
	
	System.out.println("=========================");
	
	Key key1=new Key(90,"Meveric");
	KeyBunch keyBunch1=new KeyBunch("Aloy",key1);
	keyBunch1.data();
	
}

}