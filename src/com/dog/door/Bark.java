package com.dog.door;

/**
 * Created by mapo0104 on 21.2.2017.
 */
public class Bark {
    private String sound;

    public String getSound() {
        return sound;
    }

    public Bark(String sound) {
        this.sound = sound;
    }

    public boolean equals(Object bark){
        if(bark instanceof Bark)
        {
            Bark otherBark = (Bark)bark;
            if(this.sound.equalsIgnoreCase(otherBark.getSound())){
                return true;
            }
            return false;
        }
        return false;
    }
}
