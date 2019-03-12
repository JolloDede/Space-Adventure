package clocks;

import chars.Asteroid;
import chars.Bullet;
import chars.Player;

public class Collision {

    public static boolean cPlayerAstroid(Asteroid astroid){
        return (Player.x + 5 < astroid.getX() + 15 + astroid.getWidth() - 30 && Player.x + Player.width-10 > astroid.getX() + 15 && Player.y + 15 < astroid.getY() + 15 + astroid.getHeight() - 30 && Player.y + 5 + Player.height > astroid.getY() + 15 );
    }

    public static boolean cBulletAsteroid(Bullet bullet, Asteroid asteroid){
        return (bullet.getX() < asteroid.getX() + asteroid.getWidth() && bullet.getX() + bullet.getWidth() > asteroid.getX() && bullet.getY() < asteroid.getY() + asteroid.getHeight() && bullet.getY() + bullet.getHeight() > asteroid.getY());
    }
}
