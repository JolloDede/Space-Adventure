package actions;

import chars.Player;
import clocks.Asteroid_Creation;
import clocks.Bullet_Creation;
import clocks.Mainclock;
import clocks.Star_Movement;
import gui.Gui;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    Gui g = new Gui();

    @Override
    public void start(Stage primaryStage) throws Exception{

        g.init();
        g.create(primaryStage);

        new Player();

        new Mainclock();
        Asteroid_Creation.start();
        new Bullet_Creation();
        new Star_Movement();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
