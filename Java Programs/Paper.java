class Paper {
    String thickness; // constructor
    String size; // ref
    String quality="High";
    String color; // method
    
   
    Paper(String thickness) 
	{
        System.out.println("Created constructor");
        this.thickness = thickness;
    }
    
 
    public void setColor(String color)	{
        this.color = color;
    }
    
   
    public void produce() {
        System.out.println("Method produce is running");
        System.out.println("Paper thickness: " + this.thickness);
        System.out.println("Paper size: " + this.size);
        System.out.println("Paper quality: " + this.quality);
        System.out.println("Paper color: " + this.color);
    }
    

    public static void main(String[] args) {
        Paper paper1 = new Paper("0.1 mm");
        paper1.setColor("White");
        paper1.size = "A4";
        paper1.produce();
        
        Paper paper2 = new Paper("0.2 mm");
        paper2.thickness = "0.2 mm";
        paper2.setColor("Cream");
        paper2.size = "Letter";
        paper2.quality = "Medium";
        paper2.produce();
        
        Paper paper3 = new Paper("0.3 mm");
        paper3.thickness = "0.3 mm";
        paper3.setColor("Gray");
        paper3.size = "A3";
        paper3.quality = "Premium";
        paper3.produce();
    }
}
