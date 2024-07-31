class Trumpet{
 
    String shape="Cylindrical"; //literal
	String material; //const..
	double size;  //const..
	double cost; //Ref.
	
  Trumpet(String materialLocal,double sizeLocal)
  {
	  System.out.println("Creating copy of Trumpet");
	  material=materialLocal;
	  size=sizeLocal;
  }
  
  public static void main(String[] value)
  {
	  System.out.println("Start main in Trumpet");
	  
	  Trumpet trumpet=new Trumpet("Brass",4.5);
	  trumpet.cost=10000;
	  System.out.println("Trumpet shape:"+trumpet.shape);
	  System.out.println("Trumpet material:"+trumpet.material);
	  System.out.println("Trumpet size :"+trumpet.size+"feet");
	  System.out.println("Trumpet cost:"+trumpet.cost);

	  Trumpet trumpet1=new Trumpet("Gold plated",5.2);
	  trumpet1.cost=250000;
	  System.out.println("Trumpet shape:"+trumpet1.shape);
	  System.out.println("Trumpet material:"+trumpet1.material);
	  System.out.println("Trumpet size:"+trumpet1.size+"feet");
	  System.out.println("Trumpet cost:"+trumpet1.cost);

  }
}
 

