//24-08-2024

package com.program.principles.inheritance;

import com.program.principles.Bulb;

public  class LED extends Bulb {

    public LED () {
        super();
        System.out.println("Created constructor using no args");
    }


    public static void main ( String[] args ) {

        Bulb bulb1 = new Bulb();
        bulb1.brand="Philips";
        System.out.println("Brand:" + bulb1.brand);

        bulb1.light();

        Bulb bulb2 = new LED();
        bulb2.brand="Crompton";
        System.out.println("Brand:" + bulb2.brand);

        bulb2.light();
    }
}