import logic.Game;
import ui.text.TextUIFramework;

public class Kupiec {
    public static void main(String[] args) {
        Game game = new Game();
        game.run(new TextUIFramework("!!! Witamy w grze Kupiec !!!"));
    }
}