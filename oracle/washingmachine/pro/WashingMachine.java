package com.oracle.washingmachine.pro;

public class WashingMachine {

    public String brand="Bosch";
    public String type="Front Load";
    public double capacity=7.5;

    public WashingMachine()
    {
        System.out.println("created constructor in washing machine");
    }

    public void rinse()
    {
        System.out.println("Start rinse in washing machine");
    }
    public void show()
    {
        System.out.println("Brand:"+brand);
        System.out.println("Type:"+type);
        System.out.println("Capacity:"+capacity);

    }
}
