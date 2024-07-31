class Anklet {
    
    String color = "Silver"; // Default color
    String material; // constr..
    double cost; // Constr..
    double size; // Ref
    
 
    Anklet(String materialLocal, double costLocal) 
	{
	    System.out.println("Creating copy of Anklet");
        material = materialLocal;
        cost = costLocal;
    }
    
    public static void main(String[] args) {
        System.out.println("Start main in Anklet");
        
     
        Anklet anklet = new Anklet("Gold", 2500);
        anklet.size = 25; 
        System.out.println("Anklet color: " + anklet.color);
        System.out.println("Anklet material: " + anklet.material);
        System.out.println("Anklet cost: " + anklet.cost);
        System.out.println("Anklet size: " + anklet.size + " centimeters");
        
        Anklet anklet1 = new Anklet("Platinum", 50000);
        anklet1.size = 30; 
        System.out.println("Anklet color: " + anklet1.color);
        System.out.println("Anklet material: " + anklet1.material);
        System.out.println("Anklet cost: " + anklet1.cost);
        System.out.println("Anklet size: " + anklet1.size + " centimeters");
    }
}
