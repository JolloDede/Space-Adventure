package clocks;

import game.Gamestate;
import game.Gamestate_e;
import gui.Gui;

import java.util.Timer;
import java.util.TimerTask;

/**
 * this resets what we see and sets how fast the game plays
 */
public class GameLoop implements Runnable{

    private boolean running = true;

    /**
     * this overrides run from Runnable it looks how fast the game gets painted
     */
    @Override
    public void run() {

        long lastTime = System.nanoTime();
        final double FPS = 60.0;
        double ns = 1000000000 / FPS;
        double deltaTime = 0;

        long timer = System.currentTimeMillis();

        while (running){

            long currentTime = System.nanoTime();
            deltaTime += (currentTime - lastTime) / ns;
            lastTime = currentTime;

            if (deltaTime >= 1){
                update();
                deltaTime--;
                render();
            }

            if (System.currentTimeMillis() - timer > 1000){
                timer += 1000;
            }

        }


    }

    /**
     * this makes the game thingis move
     */
    public void update(){
        if (Gamestate.state == Gamestate_e.ingame){
            Star_Movement.move();
            Astroid_Collision.collide();
            Bullet_Movement.move();
            Astroid_Movement.move();
        }
    }

    /**
     * this render the things we see
     */
    public void render(){
        Gui.gc_main.clearRect(0, 0, Gui.width, Gui.height);
        Gui.dm.draw(Gui.gc_main);
    }

}

/*
    Timer timer;

    public GameLoop(){
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
*/