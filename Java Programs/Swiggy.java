class Swiggy{

public static String order(String food){
	
	System.out.println("Start order in Swiggy");
	Hotell.getItem(food);
	System.out.println("end order in Swiggy");
	return "ok";
}
}