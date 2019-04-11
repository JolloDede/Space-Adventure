package clocks;

import chars.Bullet;
import chars.Player;
import game.Gamestate;
import game.Gamestate_e;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * This class creates Bullets infront of the Player
 * @author Dennis
 * @since
 * @version
 */
public class Bullet_Creation {

    public static ArrayList<Bullet> bullets = new ArrayList<>();
    public static Timer timer;

    /**
     * if the Player is shooting true every 200 ms a bullet gets greated
     */
    public Bullet_Creation(){
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (Gamestate.state == Gamestate_e.ingame){
                    if (Player.isShooting()){
                        bullets.add(new Bullet(Player.x + Player.width/2-8, Player.y-50, 15, 50, 20));
                    }
                }
            }
        },200, 200);
    }

}
