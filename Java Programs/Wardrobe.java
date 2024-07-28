class Wardrobe {
    String color;
    String brand;
	
    public Wardrobe()
	{
        System.out.println("Creating copy wardrobe");
    }
	
    public static void main(String[] args) 
	{
		System.out.println("Start main in Wardrobe");
        Wardrobe wardrobe = new Wardrobe();
		
		// Print default values
        System.out.println("Default color: " + wardrobe.color);
        System.out.println("Default brand: " + wardrobe.brand);

        // Initializing Color and Brand
        String color=wardrobe.color;
		wardrobe.color="Black";
		System.out.println("Initial color: " + wardrobe.color);
		
		String brand=wardrobe.brand;
		wardrobe.brand="Ikea";
        System.out.println("Initial brand: " + wardrobe.brand);

        // Reinitializing Color and Brand    
        wardrobe.color = "Brown";
        wardrobe.brand = "West Elm";
		
        System.out.println("Updated color: " + wardrobe.color);
        System.out.println("Updated brand: " + wardrobe.brand);
    }
}
