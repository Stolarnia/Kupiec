package ui;

/**
 * User stats to be displayed in game header
 */
public interface UserStatsProvider {
    /**
     * Player name
     * @return
     */
    String getName();

    /**
     * Player money
     * @return
     */
    int getMoney();

    /**
     * Name of player's current location
     * @return
     */
    String getLocationName();
    // TODO: more stats
}
