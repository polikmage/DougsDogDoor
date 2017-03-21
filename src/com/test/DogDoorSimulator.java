package com.test;

import com.dog.door.Bark;
import com.dog.door.BarkRecognizer;
import com.dog.door.DogDoor;
import com.dog.door.Remote;

/**
 * Created by Mara on 19.2.2017.
 */
public class DogDoorSimulator {

    public static void main(String[] args) {
        DogDoor door = new DogDoor();
        door.addAllowedBark(new Bark(("rowlf")));
        door.addAllowedBark(new Bark(("rooowlf")));
        door.addAllowedBark(new Bark(("rawlf")));
        door.addAllowedBark(new Bark(("woof")));
        Remote remote = new Remote(door);

        BarkRecognizer barkRecognizer = new BarkRecognizer(door);



        System.out.println("Fido barks to go outside ");
        Bark bark = new Bark("rowlf");
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


        try {
            Thread.currentThread().sleep(5000);
        }catch(InterruptedException e){ }

        System.out.println("\n Fido starts barking ");

        barkRecognizer.recognize(new Bark("rooowlf"));
        System.out.println("\n Fido went inside ");


        //
    }
}
