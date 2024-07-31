class Mug {
    
    
    String color = "Blue"; // Default color
    String material; // const.
    double cost; // const.
    double size; //  ref 
    
   
    Mug(String materialLocal, double costLocal) 
	{
		System.out.println("Creating copy of Mug");
        material = materialLocal;
        cost = costLocal;
    }
    
    public static void main(String[] args) {
        System.out.println("Start main in Mug");
        
      
        Mug mug = new Mug("Ceramic", 250);
        mug.size = 350; 
        System.out.println("Mug color: " + mug.color);
        System.out.println("Mug material: " + mug.material);
        System.out.println("Mug cost: " + mug.cost);
        System.out.println("Mug size: " + mug.size + " milliliters");
        
        Mug mug1 = new Mug("Glass", 500);
        mug1.size = 500; 
        System.out.println("Mug color: " + mug1.color);
        System.out.println("Mug material: " + mug1.material);
        System.out.println("Mug cost: " + mug1.cost);
        System.out.println("Mug size: " + mug1.size + " milliliters");
    }
}
