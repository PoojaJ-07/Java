//CapitalCity:name,population:constructor,decalre a method to print details
//state:name,language:constructor ,--->capitalCity ,decalre a method to print details
//Country:name.continent---> state--->CapitalCity,decalre a method to print details----->6/8/2024


class State
{
   String name;
   String language;
   CapitalCity capitalCity=new CapitalCity("Bengaluru",14008000);

   
   State(String name,String language)
   {
	   System.out.println("Created copy in State");
	   this.name=name;
	   this.language=language;
   }
   
   public void information()
   {
	   System.out.println("state name:"+this.name);
	   System.out.println("state language:"+this.language);
	   this.capitalCity.data();
   }
}