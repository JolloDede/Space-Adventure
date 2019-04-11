package clocks;

import gui.Gui;

/**
 * Astreroid Movement describe how the Asteroids move
 * @author Dennis
 * @since
 * @version
 */
public class Astroid_Movement {

    /**
     * AstroidMovement takes the Astroids from Creation and moves them down with their speed
     */
    public static void move(){

        for (int i = 0; i<Asteroid_Creation.asteroids.size(); i++){
            Asteroid_Creation.asteroids.get(i).setY(Asteroid_Creation.asteroids.get(i).getY() + Asteroid_Creation.asteroids.get(i).getSpeed());

            if (Asteroid_Creation.asteroids.get(i).getY() > Gui.height){
                Asteroid_Creation.asteroids.remove(i);
            }
        }
    }
}
