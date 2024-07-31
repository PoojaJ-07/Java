class Straightener{
	
	String brand="Philips";//literal
	double cost;  //const..
	String color; //const..
	String quality; //ref
	
  Straightener(double costLocal,String colorLocal)
  {
	  System.out.println("Creating Copy of Straightener");
	  cost=costLocal;
	  color=colorLocal;
  }
  public static void main(String[] args)
  {
	  System.out.println("Start main in Straightener");
	  
	  Straightener straightener=new Straightener(1500,"RoseGold");
	  straightener.quality="Best";
	  System.out.println("Straightener brand:"+straightener.brand);
	  System.out.println("Straightener cost:"+straightener.cost);
	  System.out.println("Straightener color:"+straightener.color);
	  System.out.println("Straightener quality:"+straightener.quality);
	  
	  Straightener straightener1=new Straightener(2000,"Gold");
	  straightener1.quality="Good";
	  System.out.println("Straightener brand:"+straightener1.brand);
	  System.out.println("Straightener Cost:"+straightener1.cost);
	  System.out.println("Straightener color:"+straightener1.color);   
	  System.out.println("Straightener quality:"+straightener1.quality); 
  }
}