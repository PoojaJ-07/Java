package com.oracle.gun.project;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Police {

    public void save(Gun gun)
    {
        System.out.println("start save in class police");
        if(gun!=null)
        {
            gun.display();
            gun.fire();
        }
        else {
            System.out.println("Gun is null");
            System.out.println("end save in class police");
        }
    }
}
