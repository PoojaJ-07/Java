//Print the literal,RE-Init each instance varibale and print it

class Mirror {

    String shape = "Rectangle";
    String size = "Medium";
    String material = "Glass";
    String frameColor = "Silver";

    Mirror() 
	{
        System.out.println("Creating copy of Mirror");
    }

    public static void main(String[] args) {
    System.out.println("start main in Mirror");
        
    Mirror mirror = new Mirror();
          
    System.out.println("Mirror Shape: " + mirror.shape);
    System.out.println("Mirror Size: " + mirror.size);
    System.out.println("Mirror Material: " + mirror.material);
    System.out.println("Mirror Frame Color: " + mirror.frameColor);
        
    mirror.shape = "Round";
    System.out.println("Mirror Shape: " + mirror.shape);
        
    mirror.size = "Large";
    System.out.println("Mirror Size: " + mirror.size);
        
    mirror.material = "Acrylic";
    System.out.println("Mirror Material: " + mirror.material);
        
    mirror.frameColor = "Gold";
    System.out.println("Mirror Frame Color: " + mirror.frameColor);
    }
}
