package com.test;

import com.dog.door.Bark;
import com.dog.door.BarkRecognizer;
import com.dog.door.DogDoor;

/**
 * Created by Mara on 19.2.2017.
 */
public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        door.setAllowedBarks(new Bark(("Woof")));
        //Remote remote = new Remote(door);

        BarkRecognizer barkRecognizer = new BarkRecognizer(door);



        System.out.println("Fido barks to go outside ");
        Bark bark = new Bark("Woof");
        //remote.pressButton();
        barkRecognizer.recognize(bark);

            System.out.println("\n Fido went outside ");
            System.out.println("\n Do some business... ");

        try {
            Thread.currentThread().sleep(10000);
        }catch(InterruptedException e){ }

        System.out.println("\n Fido still outside... ");

        System.out.println("\n Some dogs barking/... ");
        barkRecognizer.recognize(new Bark("Weeee"));

            //System.out.println("\n Fido is inside ");

        barkRecognizer.recognize(bark);
        System.out.println("\n Fido went inside ");


        //
    }
}
