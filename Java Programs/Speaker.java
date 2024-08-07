/*Init properties using 4 different ways
Declare a method to print all instance variables
Create least 3 copies

Speaker : brand,size,cost,output
Rocket: country,speed,fuelCapacity,noOfThrusters
Chocolate: brand,price,flavour,size
Projector: company,type,color,weight
Paper : thickness,size,quality,color*/

class Speaker{
	String brand="Boat";//literal
	String size; //ref
	double cost;  //const
	String output; // Setter method
	
	Speaker(double cost)
	{
		System.out.println("Created constructor");
		this.cost=cost;
	}
	public void setOutput(String output)
	{
		this.output=output;
	}
	public void produce()
	{
		System.out.println("method produce is running");
	    System.out.println("speaker brand:"+this.brand);
	    System.out.println("speaker size:"+this.size);
	    System.out.println("speaker cost:"+this.cost);
		System.out.println("speaker output:"+this.output);
	}
	public static void main(String[] args)
	{
		Speaker speaker=new Speaker(1500);
		speaker.setOutput("High quality sound");
		speaker.size="medium";
		speaker.produce();
		
		Speaker speaker1=new Speaker(2500);
		speaker1.brand="Sony";
		speaker1.setOutput("low quality sound");
		speaker1.size="small";
		speaker1.produce();
		
		Speaker speaker2=new Speaker(3500);
		speaker2.brand="Samsung";
		speaker2.setOutput("High quality sound");
		speaker2.size="large";
		speaker2.produce();
	}
}