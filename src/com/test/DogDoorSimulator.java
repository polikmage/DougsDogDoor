package com.test;

import com.dog.door.BarkRecognizer;
import com.dog.door.DogDoor;

/**
 * Created by Mara on 19.2.2017.
 */
public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        //Remote remote = new Remote(door);

        BarkRecognizer barkRecognizer = new BarkRecognizer(door);



        System.out.println("Fido barks to go outside ");
        //remote.pressButton();
        barkRecognizer.recognize("Wooof");

            System.out.println("\n Fido went outside ");
            System.out.println("\n Do some business... ");

        try {
            Thread.currentThread().sleep(10000);
        }catch(InterruptedException e){ }

        System.out.println("\n Fido still outside... ");

        System.out.println("\n Some dogs barking/... ");
        barkRecognizer.recognize("WRRRR");

            System.out.println("\n Fido is inside ");


            


        //
    }
}
