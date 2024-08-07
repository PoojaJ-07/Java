//Chocolate: brand,price,flavour,size

class Chocolate {
    String brand = "Perk"; // Default brand
    String size; // ref
    double price; // const..
    String flavour; // method
    
   
    Chocolate(double price) {
        System.out.println("Created constructor");
        this.price = price;
    }
    
    
    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
    
    public void produce() {
        System.out.println("Method produce is running");
        System.out.println("Chocolate brand: " + this.brand);
        System.out.println("Chocolate size: " + this.size);
        System.out.println("Chocolate price: " + this.price);
        System.out.println("Chocolate flavour: " + this.flavour);
    }
    
 
    public static void main(String[] args) {
        Chocolate chocolate1 = new Chocolate(1500);
        chocolate1.setFlavour("Wafer");
        chocolate1.size = "small";
        chocolate1.produce();
        
        Chocolate chocolate2 = new Chocolate(2500);
        chocolate2.brand = "MilkyBar";
        chocolate2.setFlavour("Milk");
        chocolate2.size = "large";
        chocolate2.produce();
        
        Chocolate chocolate3 = new Chocolate(3500);
        chocolate3.brand = "Temptation";
        chocolate3.setFlavour("Dark");
        chocolate3.size = "medium";
        chocolate3.produce();
    }
}
