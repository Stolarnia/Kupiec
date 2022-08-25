import ui.MenuOption;
import ui.UIFramework;
import ui.text.TextUIFramework;

enum Choice {
    Greater,
    Lower,
    Equal,
    Exit,
}

public class Liczby {
    public static void main(String[] args) {
        Liczby game = new Liczby();
        game.run(new TextUIFramework("Pomyśl jakąś liczbę od 0 do 1000"));

    }

    private void run(UIFramework uiFramework) {
        int lower = 0;
        int upper = 1000;
        Choice choice = Choice.Greater; // whatever for the first check

        while (choice != Choice.Equal && choice != Choice.Exit) {
            int guess = (upper + lower) / 2;
            choice = (Choice)uiFramework.showMenu(
                new MenuOption("Liczba jest większa niż " + guess, Choice.Greater),
                new MenuOption("Liczba jest mniejsza niż " + guess, Choice.Lower),
                new MenuOption("Liczba jest równa " + guess, Choice.Equal),
                new MenuOption("W dupie to mam!", Choice.Exit)
            ).getPayload();
            switch (choice) {
                case Greater: {
                    lower = guess;
                    break;
                }
                case Lower: {
                    upper = guess;
                    break;
                }
                default:
                    break;
            }
        }
    }
}
