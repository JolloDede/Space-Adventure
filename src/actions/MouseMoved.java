package actions;

import chars.Player;
import clocks.Collision;
import gui.Gui;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/**
 * This class Handles the Mousemoved event
 * @author Dennis
 * @since
 * @version
 */
public class MouseMoved implements EventHandler<MouseEvent> {

    /**
     * This method handles the Event mouseMoved
     * @param e
     */
    @Override
    public void handle(MouseEvent e) {

        Player.move((int)e.getX());

        for (int i = 0; i < Gui.buttons.length; i++){
            if (Collision.cButton(Gui.buttons[i], (int)e.getX(), (int)e.getY())){
                Gui.buttons[i].setHover(true);
            }else{
                Gui.buttons[i].setHover(false);
            }
        }

        for (int i = 0; i < Gui.button_angleds.length; i++){
            if (Collision.cButton_angled(Gui.button_angleds[i], (int)e.getX(), (int)e.getY())){
                Gui.button_angleds[i].setHover(true);
            }else{
                Gui.button_angleds[i].setHover(false);
            }
        }
    }
}
