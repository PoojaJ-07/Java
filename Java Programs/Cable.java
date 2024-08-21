
class Cable{

    String color="Black"; //literal
	String material; //const..
	double cost;  //const..
	double length; //Ref.
	
  Cable(String materialLocal,double costLocal)
  {
	  System.out.println("Creating copy of cable");
	  material=materialLocal;
	  cost=costLocal;
  }
  
  public static void main(String[] value)
  {
	  System.out.println("Start main in Cable");
	  
	  Cable cable=new Cable("Copper",600);
	  cable.length=1.5;
	  System.out.println("Cable color:"+cable.color);
	  System.out.println("Cable material:"+cable.material);
	  System.out.println("Cable cost:"+cable.cost);
	  System.out.println("Cable length:"+cable.length+"Meters");

	  Cable cable1=new Cable("Silver",3000);
	  cable1.length=2.5;
	  System.out.println("Cable color:"+cable1.color);
	  System.out.println("Cable material:"+cable1.material);
	  System.out.println("Cable cost:"+cable1.cost);
	  System.out.println("Cable length:"+cable1.length+"Meters");

  }
}