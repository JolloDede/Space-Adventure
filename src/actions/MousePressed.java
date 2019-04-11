package actions;

import chars.Player;
import clocks.Collision;
import game.Gamestate;
import game.Gamestate_e;
import gui.Gui;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/**
 * this class handles the MousePressed event
 * @author Dennis
 * @since
 * @version
 */
public class MousePressed implements EventHandler<MouseEvent> {

    /**
     * this method handles the MousePressed event
     * @param e
     */
    @Override
    public void handle(MouseEvent e) {

        // case for every gamestate shop has not button colision
        switch (Gamestate.state){
            case ingame:
                Player.isShootingfalse = true;
                break;

            case pause:
                if (Collision.cButton(Gui.buttons[0], (int)e.getX(), (int)e.getY())){
                    Gamestate.state = Gamestate_e.ingame;
                }
                if (Collision.cButton(Gui.buttons[1], (int)e.getX(), (int)e.getY())){
                    Gamestate.state = Gamestate_e.shop;
                }
                if (Collision.cButton(Gui.buttons[2], (int)e.getX(), (int)e.getY())){
                    System.exit(0);
                }
                break;

            case shop:
                break;
        }
    }
}
