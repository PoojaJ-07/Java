class Pendulum
{
    String bobSize="Small";//literal
	double length; //const..
	double mass;  //const..
	double cost; //Ref.
	
  Pendulum(double lengthLocal,double massLocal)
  {
	  System.out.println("Creating copy of Pendulum");
	  length=lengthLocal;
	  mass=massLocal;
  }
  
  public static void main(String[] value)
  {
	  System.out.println("Start main in Pendulum");
	  
	  Pendulum pendulum=new Pendulum(70,120);
	  pendulum.cost=1000;
	  System.out.println("Pendulum bobSize:"+pendulum.bobSize);
	  System.out.println("Pendulum length:"+pendulum.length+"cm");
	  System.out.println("Pendulum mass :"+pendulum.mass+"grams");
	  System.out.println("Pendulum cost:"+pendulum.cost);

	  Pendulum pendulum1=new Pendulum(80,150);
	  pendulum1.cost=500;
	  System.out.println("Pendulum bobSize:"+pendulum.bobSize);
	  System.out.println("Pendulum length:"+pendulum.length+"cm");
	  System.out.println("Pendulum mass:"+pendulum.mass+"grams");
	  System.out.println("Pendulum cost:"+pendulum.cost);

  }
}
 


