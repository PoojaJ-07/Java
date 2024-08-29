package com.oracle.gun.project;

public class Soldier {

    public void hold(){
        System.out.println("Start hold in class soldier");

        Gun gun = new Gun();
        gun.fire();;
        gun.display();

        System.out.println("End hold in class soldier");
    }
}
