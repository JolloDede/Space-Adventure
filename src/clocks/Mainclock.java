package clocks;

import game.Gamestate;
import game.Gamestate_e;
import gui.Gui;

import java.util.Timer;
import java.util.TimerTask;

public class Mainclock {

    Timer timer;

    public Mainclock(){
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    Gui.gc_main.clearRect(0, 0, Gui.width, Gui.height);
                    Gui.dm.draw(Gui.gc_main);

                    if (Gamestate.state == Gamestate_e.ingame){
                        Star_Movement.move();
                        Astroid_Collision.collide();
                        Bullet_Movement.move();
                        Astroid_Movement.move();
                    }


                } catch (Exception e) {
                    System.out.println("Main timer error");
                }
            }
        }, 30, 30);
    }
}
