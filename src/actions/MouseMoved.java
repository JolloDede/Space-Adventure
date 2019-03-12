package actions;

import chars.Player;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class MouseMoved implements EventHandler<MouseEvent> {

    @Override
    public void handle(MouseEvent e) {

        Player.move((int)e.getX());
    }
}
