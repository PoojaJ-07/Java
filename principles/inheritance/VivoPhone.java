//24-08-2024
package com.program.principles.inheritance;

import com.program.principles.SmartPhone;

public class VivoPhone extends SmartPhone {

    public VivoPhone()
    {
        System.out.println("Created constructor in vivo phone using no args ");
    }

    public static void main ( String[] args ) {

        System.out.println("Start main method");

        SmartPhone smartPhone1= new SmartPhone();
        smartPhone1.company="Samsung";
        System.out.println("Company:"+smartPhone1.company);

        smartPhone1.model="Ultra S24 series";
        System.out.println("Model:"+smartPhone1.model);

        smartPhone1.originCountry="Japan";
        System.out.println("Origin Country:"+smartPhone1.originCountry);

        smartPhone1.cost=199999;
        System.out.println("Cost:"+smartPhone1.cost);

        smartPhone1.vibrates();
        smartPhone1.rings();

        System.out.println("==================");

        SmartPhone smartPhone2= new SmartPhone();
        smartPhone2.company="OnePlus";
        System.out.println("Company:"+smartPhone2.company);

        smartPhone2.model="Nord CE 3 lite";
        System.out.println("Model:"+smartPhone2.model);

        smartPhone2.originCountry="China";
        System.out.println("Origin Country:"+smartPhone2.originCountry);

        smartPhone2.cost=22000;
        System.out.println("Cost:"+smartPhone2.cost);

        smartPhone2.vibrates();
        smartPhone2.rings();
    }
}
