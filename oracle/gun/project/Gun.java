package com.oracle.gun.project;

public class Gun {

    public String name="AK-47";
    public String countryMAde="Russia";
    public String type="Assault Rifle";

    public Gun()
    {
        System.out.println("start constuctor in class gun");
    }

    public void fire()
    {
        System.out.println("Start running fire in class gun");
    }
    public void display()
    {
        System.out.println("start running display in class gun");
        System.out.println("Gun name:"+name);
        System.out.println("Gun Country made:"+countryMAde);
        System.out.println("Gun type:"+type);
    }
}
