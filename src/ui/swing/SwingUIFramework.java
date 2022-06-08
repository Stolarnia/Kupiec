package ui.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import ui.AbstractUIFramework;
import ui.MenuOption;
import ui.UserStatsProvider;

/**
 * UIFramework providing graphical (Swing) user interface
 */
public class SwingUIFramework extends AbstractUIFramework {
    private final JFrame frame;
    private JLabel nameLabel;

    public SwingUIFramework(JFrame frame) {
        this.frame = frame;
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        nameLabel = new JLabel("Imię: ?");
        this.frame.add(nameLabel);
        this.frame.setSize(500, 500);
    }

    @Override
    public void setUserStatsProvider(UserStatsProvider userStatsProvider) {
        super.setUserStatsProvider(userStatsProvider);
        updateHeader();
        frame.setVisible(true);
    }
    
    @Override
    public MenuOption showMenu(MenuOption... options) {
        updateHeader();

        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getInput(String prompt) {
        return (String)JOptionPane.showInputDialog(
            frame,
            prompt,
            "Kupiec",
            JOptionPane.PLAIN_MESSAGE,
            null,            
            null, 
            ""
        );
    }

    @Override
    public Integer getIntegerInput(String prompt) {
        // TODO Auto-generated method stub
        return null;
    }

    private void updateHeader() {
        if (userStatsProvider != null) {
            nameLabel.setText("Imię: " + userStatsProvider.getName());
            // TODO: other stats
        }
    }
}
