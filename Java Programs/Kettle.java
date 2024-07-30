class Kettle{
    
	String brand;
	double capacity;
	String material;
	double cost;
	
	
  Kettle()
  {
  System.out.println("Creatimg copy of kettle");
  }	
  public static void main(String[] values)
  {
   Kettle kettle1=new Kettle();
   kettle1.brand="Philips";
   kettle1.capacity=1.5;
   kettle1.material="Plastic";
   kettle1.cost=1600;
   System.out.println("Kettle Brand:"+kettle1.brand);
   System.out.println("Kettle capacity:"+kettle1.capacity+" "+"L");
   System.out.println("Kettle material:"+kettle1.material);
   System.out.println("Kettle cost:"+kettle1.cost);
   
   Kettle kettle2=new Kettle();
   kettle2.brand="Braun";
   kettle2.capacity=2.0;
   kettle2.material="Glass";
   kettle2.cost=2000;
   System.out.println("Kettle Brand:"+kettle2.brand);
   System.out.println("Kettle capacity:"+kettle2.capacity+" "+"L");
   System.out.println("Kettle material:"+kettle1.material);
   System.out.println("Kettle cost:"+kettle1.cost);
   
   Kettle kettle3=new Kettle();
   kettle3.brand="Pigeon";
   kettle3.capacity=1;
   kettle2.material="Steel";
   kettle2.cost=1200;
   System.out.println("Kettle Brand:"+kettle3.brand);
   System.out.println("Kettle capacity:"+kettle3.capacity+" "+"L");
   System.out.println("Kettle material:"+kettle1.material);
   System.out.println("Kettle cost:"+kettle1.cost);
   
   
   Kettle kettle4=new Kettle();
   kettle4.brand="Cuisinart";
   kettle4.capacity=2.5;
   kettle2.material="Plastic";
   kettle2.cost=2200;
   System.out.println("Kettle Brand:"+kettle4.brand);
   System.out.println("Kettle capacity:"+kettle4.capacity+" "+"L");
   System.out.println("Kettle material:"+kettle1.material);
   System.out.println("Kettle cost:"+kettle1.cost);
   
   Kettle kettle5=new Kettle();
   kettle5.brand="Breville";
   kettle5.capacity=2;
   kettle2.material="Glass";
   kettle2.cost=1230;
   System.out.println("Kettle Brand:"+kettle5.brand);
   System.out.println("Kettle capacity:"+kettle5.capacity+" "+"L");
   System.out.println("Kettle material:"+kettle1.material);
   System.out.println("Kettle cost:"+kettle1.cost);
   
   Kettle kettle6=new Kettle();
   kettle6.brand="Tefal";
   kettle6.capacity=1.5;
   kettle2.material="Steel";
   kettle2.cost=1000;
   System.out.println("Kettle Brand:"+kettle6.brand);
   System.out.println("Kettle capacity:"+kettle6.capacity+" "+"L");
   System.out.println("Kettle material:"+kettle1.material);
   System.out.println("Kettle cost:"+kettle1.cost);
   
   Kettle kettle7=new Kettle();
   kettle7.brand="Kenwood";
   kettle7.capacity=2.5;
   kettle2.material="Plastic";
   kettle2.cost=2050;
   System.out.println("Kettle Brand:"+kettle7.brand);
   System.out.println("Kettle capacity:"+kettle7.capacity+" "+"L");
   System.out.println("Kettle material:"+kettle1.material);
   System.out.println("Kettle cost:"+kettle1.cost);
  }

}