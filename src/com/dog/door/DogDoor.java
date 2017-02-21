package com.dog.door;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Mara on 19.2.2017.
 */
public class DogDoor {
    private boolean open;
    private Bark allowedBark;

    public void setAllowedBark(Bark allowedBark) {
        this.allowedBark = allowedBark;
    }

    public Bark getAllowedBark() {

        return allowedBark;
    }

    public DogDoor() {
        this.open = false;
    }
    public void open(){
        System.out.println("The dog door opens");
        open=true;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        },5000);
    }
    public void close(){
        System.out.println("The dog door closes");
        open=false;
    }
    public boolean isOpen() {
        return open;
    }
}
