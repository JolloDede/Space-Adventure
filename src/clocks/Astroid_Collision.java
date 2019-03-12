package clocks;

import chars.Player;

public class Astroid_Collision {

    public static void collide(){

        try {

            for (int i = 0; i < Asteroid_Creation.asteroids.size(); i++){
                for (int ii = 0; ii < Bullet_Creation.bullets.size(); ii++){
                    if (Collision.cBulletAsteroid(Bullet_Creation.bullets.get(ii), Asteroid_Creation.asteroids.get(i))) {
                        Asteroid_Creation.asteroids.get(i).setHit(true);
                        Bullet_Creation.bullets.remove(ii);
                        Asteroid_Creation.asteroids.get(i).setCurrenthealth(Asteroid_Creation.asteroids.get(i).getCurrenthealth()-25);
                        if (Asteroid_Creation.asteroids.get(i).getCurrenthealth() <= 0){
                            if (Asteroid_Creation.asteroids.get(i).isContainsIridium()){
                                if (Player.iridium < 9999999999999L){
                                    Player.iridium += Asteroid_Creation.asteroids.get(i).getValue();
                                }else{
                                    Player.iridium = 9999999999999L;
                                }
                            }
                            Asteroid_Creation.asteroids.remove(i);
                        }
                    }
                }
            }

        }catch (Exception e){
            System.out.println("Asteroid Collision error");
        }

        try {
            for (int i  = 0; i < Asteroid_Creation.asteroids.size(); i++){
                if (Collision.cPlayerAstroid(Asteroid_Creation.asteroids.get(i))){
                    Player.isHit = true;
                    Player_Hit.start();
                    Asteroid_Creation.asteroids.remove(i);
                    Player.decrementHealth();
                }
            }
        }catch (Exception e){
            System.out.println("Player hit error");
        }
    }
}
