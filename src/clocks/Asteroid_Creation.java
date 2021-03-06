package clocks;

import chars.Asteroid;
import game.Gamestate;
import game.Gamestate_e;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * This class makes Asteroids and saves them into a n Array
 * @author Dennis
 * @since
 * @version
 */
public class Asteroid_Creation {

    public static ArrayList<Asteroid> asteroids = new ArrayList<>();

    public static Timer timer;
    public static int delay = 1500, period = 1500;

    /**
     * makes asteroid with a timer
     */
    public static void start(){
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (Gamestate.state == Gamestate_e.ingame){
                    asteroids.add(new Asteroid());
                }
            }
        }, delay, period);
    }
}
