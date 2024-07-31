class Harmonica
{
    String material="Reed Plates";//literal
	double weight; //const..
	double size;  //const..
	double cost; //Ref.
	
  Harmonica(double weightLocal,double sizeLocal)
  {
	  System.out.println("Creating copy of Harmonica");
	  weight=weightLocal;
	  size=sizeLocal;
  }
  
  public static void main(String[] value)
  {
	  System.out.println("Start main in Harmonica");
	  
	  Harmonica harmonica=new Harmonica(70,12);
	  harmonica.cost=7000;
	  System.out.println("Harmonica material:"+harmonica.material);
	  System.out.println("Harmonica weight:"+harmonica.weight+"grams");
	  System.out.println("Harmonica size :"+harmonica.size+"cm");
	  System.out.println("Harmonica cost:"+harmonica.cost);

	  Harmonica harmonica1=new Harmonica(80,15);
	  harmonica1.cost=5000;
	  System.out.println("Harmonica material:"+harmonica.material);
	  System.out.println("Harmonica weight:"+harmonica.weight+"grams");
	  System.out.println("Harmonica size:"+harmonica.size+"cm");
	  System.out.println("Harmonica cost:"+harmonica.cost);

  }
}
 


