class Tubelight{

    String brand;
	int powerConsumption;
	double cost;
	
Tubelight()
{
   System.out.println("Creating copy of tubelight");
}

public static void main(String[] values)
{
  System.out.println("start main in Tubelight");
  
  Tubelight tubelight1=new Tubelight();
  System.out.println("Default Brand of Tubelight:"+tubelight1.brand);
  System.out.println("Default Power Consumption of Tubelight:"+tubelight1.powerConsumption);
  System.out.println("Default cost of Tubelight:"+tubelight1.cost);
  
  Tubelight tubelight2=new Tubelight();
  tubelight2.brand="Philips";
  tubelight2.powerConsumption=40;
  tubelight2.cost=500;
  System.out.println("Brand of Tubelight:"+tubelight2.brand);
  System.out.println("Power Consumption of Tubelight:"+tubelight2.powerConsumption+" "+"Watts");
  System.out.println("Cost of Tubelight:"+tubelight2.cost);
  
  Tubelight tubelight3=new Tubelight();
  tubelight3.brand="Osram";
  tubelight3.powerConsumption=36;
  tubelight3.cost=2000;
  System.out.println("Brand of Tubelight:"+tubelight3.brand);
  System.out.println("Power Consumption of Tubelight:"+tubelight3.powerConsumption+" "+"Watts");
  System.out.println("Cost of Tubelight:"+tubelight3.cost);
  
  Tubelight tubelight4=new Tubelight();
  tubelight4.brand="Havells";
  tubelight4.powerConsumption=50;
  tubelight4.cost=2300;
  System.out.println("Brand of Tubelight:"+tubelight4.brand);
  System.out.println("Power Consumption of Tubelight:"+tubelight4.powerConsumption+" "+"Watts");
  System.out.println("Cost of Tubelight:"+tubelight4.cost);
  
  Tubelight tubelight5=new Tubelight();
  tubelight5.brand="Crompton";
  tubelight5.powerConsumption=45;
  tubelight5.cost=3500;
  System.out.println("Brand of Tubelight:"+tubelight5.brand);
  System.out.println("Power Consumption of Tubelight:"+tubelight5.powerConsumption+" "+"Watts");
  System.out.println("Cost of Tubelight:"+tubelight5.cost);
  
  Tubelight tubelight6=new Tubelight();
  tubelight6.brand="Bajaj";
  tubelight6.powerConsumption=60;
  tubelight6.cost=2600;
  System.out.println("Brand of Tubelight:"+tubelight6.brand);
  System.out.println("Power Consumption of Tubelight:"+tubelight6.powerConsumption+" "+"Watts");
  System.out.println("Cost of Tubelight:"+tubelight6.cost);
  
  Tubelight tubelight7=new Tubelight();
  tubelight7.brand="Syska";
  tubelight7.powerConsumption=30;
  tubelight7.cost=1800;
  System.out.println("Brand of Tubelight:"+tubelight7.brand);
  System.out.println("Power Consumption of Tubelight:"+tubelight7.powerConsumption+" "+"Watts");
  System.out.println("Cost of Tubelight:"+tubelight7.cost);
}
}