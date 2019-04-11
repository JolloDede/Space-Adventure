package actions;

import chars.Player;
import clocks.Asteroid_Creation;
import clocks.Bullet_Creation;
import clocks.GameLoop;
import clocks.Star_Movement;
import gui.Gui;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Main Class only for starting everything
 * @author Dennis
 * @since
 * @version
 */
public class Main extends Application {

    Gui g = new Gui();

    /**
     * This method starts the GUI gets a
     * @param primaryStage
     * and throws the exceptions
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception{

        g.init();
        g.create(primaryStage);

        new Player();

        new Thread(new GameLoop()).start();
        Asteroid_Creation.start();
        new Bullet_Creation();
        new Star_Movement();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
