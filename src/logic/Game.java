package logic;

import ui.MenuOption;
import ui.UIFramework;
import ui.UserStatsProvider;

/**
 * Main game logic
 */
public class Game implements UserStatsProvider {
    // player's name
    private String name;

    // player's money
    private int money;

    // current city (null if not in a city)
    private City currentCity;

    // available cities
    private City[] cities;

    public Game() {
        // TODO: generate new game (maybe)
    }

    /**
     * Run the game using provided UI framework
     * @param uiFramework
     */
    public void run(UIFramework uiFramework) {
        // set this as a provider so uiFramework knows where to get stats from
        uiFramework.setUserStatsProvider(this);

        // ask user for their name to display in the header
        name = uiFramework.getInput("Jak masz na imię?");

        // TODO
        uiFramework.showMenu(
            new MenuOption("opcja 1", 0),
            new MenuOption("opcja 2", 0),
            new MenuOption("opcja 3", 0)
        );

        uiFramework.getInput("fixme - remove this - it's here to pause");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public String getLocationName() {
        if (currentCity != null) {
            return currentCity.getName();
        }
        return "rozdroża";
    }
}
