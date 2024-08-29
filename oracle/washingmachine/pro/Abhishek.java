package com.oracle.washingmachine.pro;

public class Abhishek {

    public WashingMachine washingMachine;

    public void dry()
    {
        System.out.println("start dry in Class Abhishek");
        if(washingMachine != null)
        {
            washingMachine.show();
            washingMachine.rinse();
        }
        else {
            System.out.println("Washing machine is null");
        }
    }
}
