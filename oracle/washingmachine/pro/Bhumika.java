package com.oracle.washingmachine.pro;

public class Bhumika {

    public WashingMachine buy()
    {
        System.out.println("Start buy in washing machine");
        WashingMachine washingMachine = new WashingMachine();
        if(washingMachine != null)
        {
            washingMachine.show();

        }else {
            System.out.println("Washing machine is null");
        }
        return washingMachine;
    }
}
