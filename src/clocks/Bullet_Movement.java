package clocks;

import gui.Gui;

/**
 * This class moves the Bullets and destroys them if they are you of range
 * @author Dennis
 * @since
 * @version
 */
public class Bullet_Movement {

    /**
     * and destroys the bullets if they are you of range
     */
    public static void move(){
        for (int i = 0; i < Bullet_Creation.bullets.size(); i++){
            Bullet_Creation.bullets.get(i).setY(Bullet_Creation.bullets.get(i).getY() - Bullet_Creation.bullets.get(i).getSpeed());
            if (Bullet_Creation.bullets.get(i).getY() > Gui.height){
                Bullet_Creation.bullets.remove(i);
            }
        }
    }
}
