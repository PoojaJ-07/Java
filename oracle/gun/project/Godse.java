package com.oracle.gun.project;

public class Godse {

    public Gun move()
    {
        System.out.println("start running move in godse");
        Gun gun =new Gun();
        System.out.println("end running move in godse");
        if(gun != null)
        {
            gun.fire();
            gun.display();
        }
        else
        {
            System.out.println("Gun is null");
        }
        return gun;
    }
}
