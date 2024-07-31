class Watch{
	
	String brand="Fossil";//literal
	double cost;  //const..
	String color; //const..
	String quality; //ref
	
  Watch(double costLocal,String colorLocal)
  {
	  System.out.println("Creating Copy of Watch");
	  cost=costLocal;
	  color=colorLocal;
  }
  public static void main(String[] args)
  {
	  System.out.println("Start main in watch");
	  
	  Watch watch=new Watch(84000,"RoseGold");
	  watch.quality="Best";
	  System.out.println("Watch brand:"+watch.brand);
	  System.out.println("Watch cost:"+watch.cost);
	  System.out.println("Watch color:"+watch.color);
	  System.out.println("Watch quality:"+watch.quality);
	  
	  Watch watch1=new Watch(90000,"Gold");
	  watch1.quality="Good";
	  System.out.println("Watch brand:"+watch1.brand);
	  System.out.println("Watch Cost:"+watch1.cost);
	  System.out.println("Watch color:"+watch1.color);   
	  System.out.println("Watch quality:"+watch1.quality); 
  }
}