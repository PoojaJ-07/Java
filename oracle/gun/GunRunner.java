package com.oracle.gun;

import com.oracle.gun.project.*;

public class GunRunner {

    public static void main ( String[] args ) {

        System.out.println("Start main");

        Soldier soldier = new Soldier();
        soldier.hold();

        System.out.println("=====================");

        Gun gun = new Gun();
        Police police =new Police();
        police.save(gun);

        System.out.println("=====================");

        Dboss dboss= new Dboss();
        dboss.gun=new Gun();
        dboss.run();

        System.out.println("=====================");

        Godse godse = new Godse();
        godse.move();


    }
}
