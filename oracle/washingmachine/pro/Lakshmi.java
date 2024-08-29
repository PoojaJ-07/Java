package com.oracle.washingmachine.pro;

public class Lakshmi {

    public void wash(WashingMachine washingMachine)
    {
        System.out.println("Start run wash in Lakshmi");

        if(washingMachine != null)
        {
            washingMachine.rinse();
            washingMachine.show();
        }
        else {
            System.out.println("Washing machine is null");
        }
    }
}
