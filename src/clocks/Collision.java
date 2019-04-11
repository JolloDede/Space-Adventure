package clocks;

import chars.Asteroid;
import chars.Bullet;
import chars.Player;
import gui.Button;
import gui.Button_angled;

/**
 * this class returns if the something was hit by a mouse of a hit box
 * @author Dennis
 * @since
 * @version
 */
public class Collision {

    /**
     * this return if the Player was hit by a Astroid
     * @param astroid this is the astroids wich it tests
     * @return of boolean
     */
    public static boolean cPlayerAstroid(Asteroid astroid){
        return (Player.x + 5 < astroid.getX() + 15 + astroid.getWidth() - 30 && Player.x + Player.width-10 > astroid.getX() + 15 && Player.y + 15 < astroid.getY() + 15 + astroid.getHeight() - 30 && Player.y + 5 + Player.height > astroid.getY() + 15 );
    }

    /**
     * this returns if a Bullet has hit a Astroid
     * @param bullet this is the Bullet
     * @param asteroid this is the Astroid
     * @return return boolen
     */
    public static boolean cBulletAsteroid(Bullet bullet, Asteroid asteroid){
        return (bullet.getX() < asteroid.getX() + asteroid.getWidth() && bullet.getX() + bullet.getWidth() > asteroid.getX() && bullet.getY() < asteroid.getY() + asteroid.getHeight() && bullet.getY() + bullet.getHeight() > asteroid.getY());
    }

    /**
     * this returns if the Mouse hit a button
     * @param button this is the Button
     * @param x x coordinate from the mouse
     * @param y y coordinate from the mouse
     * @return return true if the button got hit
     */
    public static boolean cButton(Button button, int x, int y){
        return (x < button.getX() + button.getWidth() && x > button.getX() && y < button.getY() + button.getHeight() && y > button.getY());
    }

    /**
     * this returns if a angled button got hit
     * @param button this gives the button
     * @param x this is the x coordinate from the mouse
     * @param y this is the y coordinate from the mouse
     * @return true if the button got hit
     */
    public static boolean cButton_angled(Button_angled button, int x, int y){
        return (x < button.getX1() + button.getWidth() && x > button.getX1() && y < button.getY1() + button.getHeight() && y > button.getY1());
    }
}
