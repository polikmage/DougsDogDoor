package com.dog.door;

/**
 * Created by Mara on 19.2.2017.
 */
public class BarkRecognizer {
    private DogDoor door;


    public BarkRecognizer(DogDoor door) {
        this.door = door;

    }
    public void recognize(String bark){

        System.out.println("Heard a right bark");
        door.open();




    }
}
