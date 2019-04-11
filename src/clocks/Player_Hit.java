package clocks;


import chars.Player;

import java.util.Timer;
import java.util.TimerTask;

/**
 * this class sets the isHit variable to false every now and then
 * @author Dennis
 * @since
 * @version
 */
public class Player_Hit {

    /**
     * timer every 300 ms ishit flase that the game goes on when the Player gets hit
     */
    public static void start(){
        Timer time = new Timer();
        time.schedule(new TimerTask() {
            @Override
            public void run() {
                Player.isHit = false;
                time.cancel();
            }
        }, 300);
    }
}
