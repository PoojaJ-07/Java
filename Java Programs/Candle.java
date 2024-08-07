class Candle
{
   double length;
   double price;
   String fragrance;
   
   Candle(double length)
   {
	   this.length=length;
	   System.out.println("Creating copy of candle using double..");
   }
   Candle(double length,String fragrance)
   {
	   this.length=length;
	   this.fragrance=fragrance;
	   System.out.println("Creating copy of candle using double and String..");
   }
   Candle(String fragrance,double length,double price)
   {
	   this.fragrance=fragrance;
	   this.length=length;
	   this.price=price;
	   System.out.println("Creating copy of candle using String,double and double..");
   }
   Candle()
   {}
   Candle(String fragrance,double price)
   {
	   this.price=price;
	   this.fragrance=fragrance;
	   System.out.println("Creating copy of candle using String and double..");	   
   }
   Candle(double length,String fragrance,double price)
   {
	   this.length=length;
	   this.fragrance=fragrance;
	   this.price=price;
	   System.out.println("Creating copy of candle using double,String and double..");    
   }
   Candle(double length,double price,String fragrance)
	  {
		  this.length=length;
		  this.price=price;
		  this.fragrance=fragrance;
		  System.out.println("Creating copy of candle using double,double,string..");
	  }
    Candle(String fragrance)
	{
		this.fragrance=fragrance;
		System.out.println("Creating copy of candle using string..");
	}
}