class Mask
{
   String material="N95";//literal
   boolean isReusable; //constructor
   String color;       //constructor
   int numberOfLayers; //ref
   
   Mask(boolean isReusableLocal,String colorLocal)
  {
	  System.out.println("Creating copy of Mask");
	  isReusable=isReusableLocal;
	  color=colorLocal;
  }
  
  public static void main(String[] value)
  {
	  System.out.println("Start main in Mask");
	  
	  Mask mask=new Mask(true,"Gray");
	  mask.numberOfLayers=5;
	  System.out.println("Mask material:"+mask.material);
	  System.out.println("Mask is Reusable:"+mask.isReusable);
	  System.out.println("Mask color:"+mask.color);
	  System.out.println("MasknumberOfLayers:"+mask.numberOfLayers);

	  Mask mask1=new Mask(false,"Black");
	  mask1.numberOfLayers=7;
	  System.out.println("Mask material:"+mask1.material);
	  System.out.println("Mask is Reusable:"+mask1.isReusable);
	  System.out.println("Mask color:"+mask1.color);
	  System.out.println("Mask number Of Layers:"+mask1.numberOfLayers);

  }
}