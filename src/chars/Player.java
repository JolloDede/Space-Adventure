package chars;

import game.Gamestate;
import game.Gamestate_e;
import gui.Gui;

/**
 * This class is the Player it self
 * @author Dennis
 * @since
 * @version
 */
public class Player {

    public static int x, y, width=56, height=152;
    public static boolean isShootingfalse = false;
    public static int health = 3;
    public static long iridium = 1000000L;
    public static boolean isHit = false;

    /**
     * the returns the variable isShooting
     * @return
     */
    public static boolean isShooting(){
        return isShootingfalse;
    }

    /**
     * The Constructor sets the Player in the bottom center
     */
    public Player(){
        x = Gui.width/2 - width/2;
        y = Gui.height - 200;
    }

    /**
     * this method decreases the health of the Player
     */
    public static void decrementHealth(){
        if (health > 1){
            health --;
        }else{
            health = 3;
        }

    }

    /**
     * This Method moves the Player synchronous to the mouse
     * the x Coordinate from the mouse @param xMouse
     */
    public static void move(int xMouse){

        if (Gamestate.state == Gamestate_e.ingame){
            if (xMouse >= width && xMouse <= Gui.width-width){
                x = xMouse - width/2;
            }
        }
    }

    /**
     * this method returns if the rocat is hit
     * @return
     */
    public static boolean isHit(){
        return isHit;
    }
}
