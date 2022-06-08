import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import logic.Game;
import ui.swing.SwingUIFramework;

public class SwingKupiec extends JFrame {
    public SwingKupiec() {
        super("Kupiec");
        Game game = new Game();
        game.run(new SwingUIFramework(this));
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(SwingKupiec::new);
    }
}