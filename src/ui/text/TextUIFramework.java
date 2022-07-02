package ui.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ui.AbstractUIFramework;
import ui.MenuOption;

/**
 * UIFramework providing text user interface
 */
public class TextUIFramework extends AbstractUIFramework {
    private final Scanner scanner;
    private ArrayList<Object> menuOptions = new ArrayList();
    /**
     * 
     * @param welcome text to be displayed upon framework startup
     */
    public TextUIFramework(String welcome) {
        scanner = new Scanner(System.in);
        System.out.println(welcome);
    }

    @Override
    public MenuOption showMenu(MenuOption... options) {
        showHeader();
        menuOptions.add(options);

        for (int i = 0; i < menuOptions.size(); i++) {
            System.out.println(i + 1 + " " + menuOptions.get(i));
        }

        System.out.println("Co zamierzasz?");
        int choice;
        do {
            choice = scanner.nextInt();
            scanner.nextLine();
        } while (choice < 1 || choice > menuOptions.size());

        for (int i = 0; i < menuOptions.size(); i++) {
            if (menuOptions.get(i).equals(choice - 1)) {
                return null;
            }
        }
        return null;
    }

    @Override
    public String getInput(String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextLine();
    }

    @Override
    public Integer getIntegerInput(String prompt) {
        // TODO Auto-generated method stub
        return null;
    }

    private void showHeader() {
        if (userStatsProvider != null) {
            System.out.println("Imię: " + userStatsProvider.getName());
            System.out.println("Lokalizacja: " + userStatsProvider.getLocationName());
            System.out.println("Dukaty: " + userStatsProvider.getMoney());
        }
    }
}
