package com.oracle.gun.project;

public class Dboss {

    public Gun gun;

    public void run () {
        System.out.println("Start run in class Dboss");

        System.out.println("start save in class police");
        if (gun != null) {
            gun.display();

        } else {
            System.out.println("Gun is null");
            System.out.println("start save in class police");
        }
    }
}
