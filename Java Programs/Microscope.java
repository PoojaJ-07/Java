class Microscope{

 String magnification;
 String illumination;
 double cost;
 
 Microscope()
 {
 System.out.println("Creatimg copy of Microscope");
 }
public static void main(String[] args){
 Microscope microscope1=new Microscope();
 microscope1.magnification="10x";
 microscope1.illumination="LED Light";
 microscope1.cost=3000;
 System.out.println("Magnification of microscope:"+microscope1.magnification);
 System.out.println("Illumination of microscope:"+microscope1.illumination);
 System.out.println("Cost of microscope:"+ microscope1.cost);
 
 Microscope microscope2=new Microscope();
 microscope2.magnification="4x";
 microscope2.illumination="Halogen Lamp";
 microscope2.cost=2000;
 System.out.println("Magnification of microscope:"+microscope2.magnification);
 System.out.println("Illumination of microscope:"+microscope2.illumination);
 System.out.println("Cost of microscope:"+ microscope2.cost);
 
 Microscope microscope3=new Microscope();
 microscope3.magnification="20x";
 microscope3.illumination="Fluroscent lamp";
 microscope3.cost=3400;
 System.out.println("Magnification of microscope:"+microscope3.magnification);
 System.out.println("Illumination of microscope:"+microscope3.illumination);
 System.out.println("Cost of microscope:"+ microscope3.cost);
 
 Microscope microscope4=new Microscope();
 microscope4.magnification="40x";
 microscope4.cost=4000;
 microscope4.illumination="Incandescent bulb";
 System.out.println(" Magnification of microscope:"+microscope4.magnification);
 System.out.println(" Illumination of microscope:"+microscope4.illumination);
 System.out.println("Cost of microscope:"+ microscope4.cost);
 
 Microscope microscope5=new Microscope();
 microscope5.magnification="100x";
 microscope5.illumination="Quartz lamp";
 microscope5.cost=3800;
 System.out.println(" Magnification of microscope:"+microscope5.magnification);
 System.out.println(" Illumination of microscope:"+microscope5.illumination);
 System.out.println("Cost of microscope:"+ microscope5.cost);
 
 Microscope microscope6=new Microscope();
 microscope6.magnification="60x";
 microscope6.illumination="Mirror";
 microscope6.cost=1700;
 System.out.println(" Magnification of microscope:"+microscope6.magnification);
 System.out.println(" Illumination of microscope:"+microscope6.illumination);
 System.out.println("Cost of microscope:"+ microscope6.cost);
 
 Microscope microscope7=new Microscope();
 microscope7.magnification="200x";
 microscope7.illumination="Fiber optic illumination";
 microscope7.cost=3100;
 System.out.println(" Magnification of microscope:"+microscope7.magnification);
 System.out.println(" Illumination of microscope:"+microscope7.illumination);
 System.out.println("Cost of microscope:"+ microscope7.cost);
}
}