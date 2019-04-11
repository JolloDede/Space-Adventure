package actions;

import chars.Player;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/**
 * This class handles the MouseReleased event
 */
public class MouseReleased implements EventHandler<MouseEvent> {

    /**
     * This method handles the MouseReleased event
     * @param e
     */
    @Override
    public void handle(MouseEvent e) {
        Player.isShootingfalse = false;
    }
}
