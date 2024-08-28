package com.program.principles.inheritance;

import com.program.principles.Bull;

public class SahiwalBull extends Bull {

    public SahiwalBull()
    {
        System.out.println("created using constr..sahiwal bull with no args");
    }

    public static void main ( String[] args ) {

        System.out.println("start main method");

        Bull bull1 =new Bull();
        bull1.breed="Kankrej";
        System.out.println("Bull Breed:"+bull1.breed);
        bull1.age=30;
        System.out.println("Bull cost:"+bull1.age);
        bull1.origin="Gujarat";
        System.out.println("Bull origin:"+bull1.origin);
        bull1.weight=250;
        System.out.println("Bull weight:"+bull1.weight+"KGs");
        bull1.color="Brown";
        System.out.println("Bull color:"+bull1.color);

        bull1.grazing();
        bull1.bellowing();
        bull1.resting();
        bull1.sleep();;
        bull1.playing();

        System.out.println("========================");

        Bull bull2 =new SahiwalBull();
        bull2.breed="Ongole";
        System.out.println("Bull Breed:"+bull2.breed);
        bull2.age=35;
        System.out.println("Bull age:"+bull2.age);
        bull2.origin="AndraPradesh";
        System.out.println("Bull origin:"+bull2.origin);
        bull2.weight=280;
        System.out.println("Bull weight:"+bull2.weight);
        bull2.color="Black";
        System.out.println("Bull color:"+bull2.color);

        bull2.grazing();
        bull2.bellowing();
        bull2.resting();
        bull2.sleep();;
        bull2.playing();
    }
}
