package actions;

import chars.Player;
import game.Gamestate;
import game.Gamestate_e;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/**
 * this class handles the Mousedragged Event
 * @author Dennis
 * @since
 * @version
 */
public class MouseDragged implements EventHandler<MouseEvent> {

    /**
     * this is the MouseEvent
     * @param e
     */
    @Override
    public void handle(MouseEvent e) {
        if (Gamestate.state == Gamestate_e.ingame){
            //Player.isShooting  = true;
            Player.move((int)e.getX());

        }
    }
}
