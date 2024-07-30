class MusicalInstrument{
	
	String name;
	String type;
	double weight;
	double cost;
	
MusicalInstrument()
{
	System.out.println("Creating copy of Musical Instrument");
}
public static void main(String[] values)
{
	System.out.println("Start main in Musical Instrument");
	
	MusicalInstrument musicalInstrument= new MusicalInstrument();
	System.out.println("Default name:"+musicalInstrument.name);
	System.out.println("Default type:"+musicalInstrument.type);
	System.out.println("Default weight:"+musicalInstrument.weight);
	System.out.println("Default cost:"+musicalInstrument.cost);
	
	MusicalInstrument musicalInstrument1= new MusicalInstrument();
	musicalInstrument1.name="Piano";
	musicalInstrument1.type="Keyboard";
	musicalInstrument1.weight=150;
	musicalInstrument1.cost=150000;
	System.out.println("Musical Instrument name:"+ musicalInstrument1.name);
	System.out.println("Musical Instrument type:"+ musicalInstrument1.type);
	System.out.println("Musical Instrument weight:"+ musicalInstrument1.weight+"KG");
	System.out.println("Musical Instrument cost:"+ musicalInstrument1.cost);
	
	MusicalInstrument musicalInstrument2= new MusicalInstrument();
	musicalInstrument2.name="Guitar";
	musicalInstrument2.type="Strings";
	musicalInstrument2.weight=2.7;
	musicalInstrument2.cost=9000;
	System.out.println("Musical Instrument name:"+ musicalInstrument2.name);
	System.out.println("Musical Instrument type:"+ musicalInstrument2.type);
	System.out.println("Musical Instrument weight:"+ musicalInstrument2.weight+"KG");
	System.out.println("Musical Instrument cost:"+ musicalInstrument2.cost);
	
	MusicalInstrument musicalInstrument3= new MusicalInstrument();
	musicalInstrument3.name="Violin";
	musicalInstrument3.type="Strings";
	musicalInstrument3.weight=.59;
	musicalInstrument3.cost=8000;
	System.out.println("Musical Instrument name:"+ musicalInstrument3.name);
	System.out.println("Musical Instrument type:"+ musicalInstrument3.type);
	System.out.println("Musical Instrument weight:"+ musicalInstrument3.weight+"KG");
	System.out.println("Musical Instrument cost:"+ musicalInstrument3.cost);
	
	MusicalInstrument musicalInstrument4= new MusicalInstrument();
	musicalInstrument4.name="Flute";
	musicalInstrument4.type="Woodwind";
	musicalInstrument4.weight=.45;
	musicalInstrument4.cost=50000;
	System.out.println("Musical Instrument name:"+ musicalInstrument4.name);
	System.out.println("Musical Instrument type:"+ musicalInstrument4.type);
	System.out.println("Musical Instrument weight:"+ musicalInstrument4.weight+"KG");
	System.out.println("Musical Instrument cost:"+ musicalInstrument4.cost);
	
	MusicalInstrument musicalInstrument5= new MusicalInstrument();
	musicalInstrument5.name="Trumpet";
	musicalInstrument5.type="Brass";
	musicalInstrument5.weight=0.60;
	musicalInstrument5.cost=15000;
	System.out.println("Musical Instrument name:"+ musicalInstrument5.name);
	System.out.println("Musical Instrument type:"+ musicalInstrument5.type);
	System.out.println("Musical Instrument weight:"+ musicalInstrument5.weight+"KG");
	System.out.println("Musical Instrument cost:"+ musicalInstrument5.cost);
	
	MusicalInstrument musicalInstrument6= new MusicalInstrument();
	musicalInstrument6.name="Drums";
	musicalInstrument6.type="Percussion";
	musicalInstrument6.weight=4.5;
	musicalInstrument6.cost=5000;
	System.out.println("Musical Instrument name:"+ musicalInstrument6.name);
	System.out.println("Musical Instrument type:"+ musicalInstrument6.type);
	System.out.println("Musical Instrument weight:"+ musicalInstrument6.weight+"KG");
	System.out.println("Musical Instrument cost:"+ musicalInstrument6.cost);
	
	MusicalInstrument musicalInstrument7= new MusicalInstrument();
	musicalInstrument7.name="Saxophone";
	musicalInstrument7.type="Woodwind";
	musicalInstrument7.weight=2.9;
	musicalInstrument7.cost=24000;
	System.out.println("Musical Instrument name:"+ musicalInstrument7.name);
	System.out.println("Musical Instrument type:"+ musicalInstrument7.type);
	System.out.println("Musical Instrument weight:"+ musicalInstrument7.weight+"KG");
	System.out.println("Musical Instrument cost:"+ musicalInstrument.cost);	
}
}