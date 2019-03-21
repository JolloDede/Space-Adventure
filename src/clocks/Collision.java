package clocks;

import chars.Asteroid;
import chars.Bullet;
import chars.Player;
import gui.Button;
import gui.Button_angled;

public class Collision {

    public static boolean cPlayerAstroid(Asteroid astroid){
        return (Player.x + 5 < astroid.getX() + 15 + astroid.getWidth() - 30 && Player.x + Player.width-10 > astroid.getX() + 15 && Player.y + 15 < astroid.getY() + 15 + astroid.getHeight() - 30 && Player.y + 5 + Player.height > astroid.getY() + 15 );
    }

    public static boolean cBulletAsteroid(Bullet bullet, Asteroid asteroid){
        return (bullet.getX() < asteroid.getX() + asteroid.getWidth() && bullet.getX() + bullet.getWidth() > asteroid.getX() && bullet.getY() < asteroid.getY() + asteroid.getHeight() && bullet.getY() + bullet.getHeight() > asteroid.getY());
    }

    public static boolean cButton(Button button, int x, int y){
        return (x < button.getX() + button.getWidth() && x > button.getX() && y < button.getY() + button.getHeight() && y > button.getY());
    }

    public static boolean cButton_angled(Button_angled button, int x, int y){
        return (x < button.getX1() + button.getWidth() && x > button.getX1() && y < button.getY1() + button.getHeight() && y > button.getY1());
    }
}
