 class Radio{
 
    String color="Brown"; //literal
	String material; //const..
	double cost;  //const..
	double frequency; //Ref.
	
  Radio(String materialLocal,double costLocal)
  {
	  System.out.println("Creating copy of Radio");
	  material=materialLocal;
	  cost=costLocal;
  }
  
  public static void main(String[] value)
  {
	  System.out.println("Start main in Radio");
	  
	  Radio radio=new Radio("Plastic Casings",1500);
	  radio.frequency=10;
	  System.out.println("Radio color:"+radio.color);
	  System.out.println("Radio material:"+radio.material);
	  System.out.println("Radio cost:"+radio.cost);
	  System.out.println("Radio frequency:"+radio.frequency+"Hz");

	  Radio radio1=new Radio("Metal casings",3000);
	  radio1.frequency=25;
	  System.out.println("Radio color:"+radio1.color);
	  System.out.println("Radio material:"+radio1.material);
	  System.out.println("Radio cost:"+radio1.cost);
	  System.out.println("Radio frequency:"+radio1.frequency+"Hz");

  }
}
 