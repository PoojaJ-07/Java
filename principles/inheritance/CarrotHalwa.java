//24-08-2024
package com.program.principles.inheritance;

import com.program.principles.Halwa;

public class CarrotHalwa extends Halwa {

    public CarrotHalwa()
    {
        super();
        System.out.println("Created constructor carrot halwa using no args");
    }

    public static void main ( String[] args ) {

        System.out.println("Start main method");

        Halwa halwa1=new Halwa();
        halwa1.variety="Sujji Halwa";
        System.out.println("Variety:"+halwa1.variety);
        halwa1.color="White";
        System.out.println("Color:"+halwa1.color);
        halwa1.cost=140;
        System.out.println("Cost:"+halwa1.cost);

        halwa1.cook();
        halwa1.order();

        System.out.println("=================");
        Halwa halwa2=new CarrotHalwa();
        halwa2.variety="Pineapple Halwa";
        System.out.println("Variety:"+halwa2.variety);
        halwa2.color="Yellow";
        System.out.println("Color:"+halwa2.color);
        halwa2.cost=180;
        System.out.println("Cost:"+halwa2.cost);

        halwa2.cook();
        halwa2.order();
    }
}
