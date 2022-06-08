package ui;

/**
 * UIFramework provides methods to show game UI and ask for user input
 */
public interface UIFramework {
    void setUserStatsProvider(UserStatsProvider userStatsProvider);

    /**
     * Show menu with options
     * @param options menu options to show
     * @return selected menu option
     */
    MenuOption showMenu(MenuOption... options);

    /**
     * Ask user for a textual input
     * @param prompt to display as a question
     * @return input provided by the user
     */
    String getInput(String prompt);

    /**
     * Ask user for a number input
     * @param prompt to display as a question
     * @return number provided by the user or null if not a number was provided
     */
    Integer getIntegerInput(String prompt);
}
