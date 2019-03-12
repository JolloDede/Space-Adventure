package actions;

import chars.Player;
import game.Gamestate;
import game.Gamestate_e;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class MousePressed implements EventHandler<MouseEvent> {

    @Override
    public void handle(MouseEvent e) {

        if (Gamestate.state == Gamestate_e.ingame){
            Player.isShootingfalse  = true;
        }
    }
}
