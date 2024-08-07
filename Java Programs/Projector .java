class Projector {
    String company = "Epson"; // Default company
    String type; // ref
    double weight; // constr.
    String color; // method
    
    
    Projector(double weight) {
        System.out.println("Created constructor");
        this.weight = weight;
    }
    

    public void setColor(String color) {
        this.color = color;
    }
    

    public void produce() {
        System.out.println("Method produce is running");
        System.out.println("Projector company: " + this.company);
        System.out.println("Projector type: " + this.type);
        System.out.println("Projector weight: " + this.weight);
        System.out.println("Projector color: " + this.color);
    }
    
   
    public static void main(String[] args) {
        Projector projector1 = new Projector(2.5);
        projector1.setColor("Black");
        projector1.type = "DLP";
        projector1.produce();
        
        Projector projector2 = new Projector(3.0);
        projector2.company = "BenQ";
        projector2.setColor("White");
        projector2.type = "LCD";
        projector2.produce();
        
        Projector projector3 = new Projector(4.0);
        projector3.company = "Sony";
        projector3.setColor("Gray");
        projector3.type = "LCoS";
        projector3.produce();
    }
}
