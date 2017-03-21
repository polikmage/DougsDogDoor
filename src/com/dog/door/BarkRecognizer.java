package com.dog.door;

import java.util.List;

/**
 * Created by Mara on 19.2.2017.
 */
public class BarkRecognizer {
    private DogDoor door;


    public BarkRecognizer(DogDoor door) {
        this.door = door;

    }
    public void recognize(Bark bark){

        List<Bark> allowedBarks = door.getAllowedBarks();
        for (Bark allowedBark:allowedBarks) {
            if (bark.equals(allowedBark)) {
                System.out.println("Bark recognizer: Heard " +  "\"" + bark.getSound() + "\"");
                door.open();
                return;
            }

        }
        System.out.println("Bark recognizer: Heard " +  "\"" + bark.getSound() + "\"");



    }
}
