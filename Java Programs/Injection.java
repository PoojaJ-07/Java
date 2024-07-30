class Injection{
	
	String name;
	double volume;
	double cost;

Injection()
{
	System.out.println("Creating copy of Injection");
}

public static void main(String[] values)
{
	System.out.println("Start main in Injection");
	
	Injection injection1= new Injection();
	System.out.println("Default name of injection:"+injection1.name);
	System.out.println("Default volume of injection:"+injection1.volume);
    System.out.println("Default cost of injection:"+injection1.cost);
	
	Injection injection2= new Injection();
	injection2.name="BD Safety Syringe";
	injection2.volume=20;
	injection2.cost=200;
	System.out.println("name of injection:"+injection2.name);
	System.out.println("volume of injection:"+injection2.volume+" "+"cc/min");
    System.out.println("Cost of injection:"+injection2.cost);
	
	Injection injection3= new Injection();
	injection3.name="Bosch EV14";
	injection3.volume=10;
	injection3.cost=1000;
	System.out.println("name of injection:"+injection3.name);
	System.out.println("volume of injection:"+injection3.volume+" "+"cc/min");
    System.out.println("Cost of injection:"+injection3.cost);  	
	
	Injection injection4= new Injection();
	injection4.name="NovoPen Echo";
	injection4.volume=12;
	injection4.cost=1400;
	System.out.println("name of injection:"+injection4.name);
	System.out.println("volume of injection:"+injection4.volume+" "+"cc/min");
    System.out.println("Cost of injection:"+injection4.cost);
	
	Injection injection5= new Injection();
	injection5.name="Septoject Evolution";
	injection5.volume=22;
	injection5.cost=1000;
	System.out.println("name of injection:"+injection5.name);
	System.out.println("volume of injection:"+injection5.volume+" "+"cc/min");
    System.out.println("Cost of injection:"+injection5.cost);
	
	
	Injection injection6= new Injection();
	injection6.name="Siemens Deka IV";
	injection6.volume=11;
	injection6.cost=1210;
	System.out.println("name of injection:"+injection6.name);
	System.out.println("volume of injection:"+injection6.volume+" "+"cc/min");
	 System.out.println("Cost of injection:"+injection6.cost);
	
	Injection injection7= new Injection();
	injection7.name="MicronJet";
	injection7.volume=16;
	injection7.cost=1600;
	System.out.println("name of injection:"+injection7.name);
	System.out.println("volume of injection:"+injection7.volume+" "+"cc/min");
	 System.out.println("Cost of injection:"+injection7.cost);
}	
}