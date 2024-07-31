class Syringe{

    String color="White"; //literal
	String name; //const..
	double cost;  //const..
	double volume; //Ref.
	
  Syringe(String nameLocal,double costLocal)
  {
	  System.out.println("Creating copy of Syringe");
	  name=nameLocal;
	  cost=costLocal;
  }
  
  public static void main(String[] value)
  {
	  System.out.println("Start main in Syringe");
	  
	  Syringe syringe=new Syringe("NovoPen Echo",600);
	  syringe.volume=1.5;
	  System.out.println("Syringe color:"+syringe.color);
	  System.out.println("Syringe name:"+syringe.name);
	  System.out.println("Syringe cost:"+syringe.cost);
	  System.out.println("Syringe volume:"+syringe.volume+"cc/min");

	  Syringe syringe1=new Syringe("MicronJet",3000);
	  syringe1.volume=2.5;
	  System.out.println("Syringe color:"+syringe1.color);
	  System.out.println("Syringe name:"+syringe1.name);
	  System.out.println("Syringe cost:"+syringe1.cost);
	  System.out.println("Syringe volume:"+syringe1.volume+"cc/min");

  }
}