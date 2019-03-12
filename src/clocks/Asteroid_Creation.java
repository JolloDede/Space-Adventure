package clocks;

import chars.Asteroid;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Asteroid_Creation {

    public static ArrayList<Asteroid> asteroids = new ArrayList<>();

    public static Timer timer;
    public static int delay = 1500, period = 1500;

    public static void start(){
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                asteroids.add(new Asteroid());
            }
        }, delay, period);
    }
}
