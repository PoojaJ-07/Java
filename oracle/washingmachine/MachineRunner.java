package com.oracle.washingmachine;

import com.oracle.washingmachine.pro.*;

public class MachineRunner {


    public static void main ( String[] args ) {

        System.out.println("Start main in Machine runner");

        Megha megha = new Megha();
        megha.use();
        System.out.println("******************");

        WashingMachine washingMachine = new WashingMachine();
        Lakshmi lakshmi = new Lakshmi();
        lakshmi.wash(washingMachine);
        System.out.println("******************");

        Abhishek abhishek =new Abhishek();
        abhishek.washingMachine = new WashingMachine();
        System.out.println(abhishek.washingMachine);
        System.out.println("******************");

        Bhumika bhumika = new Bhumika();
        WashingMachine washingMachine1 = new WashingMachine();
        bhumika.buy();
    }
}
