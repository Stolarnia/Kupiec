package ui;


import java.util.Scanner;

/**
 * Represents an option selectable in a menu
 */
public class MenuOption {
    private final String caption;
    private final Object payload;

    /**
     * Caption to display as a menu entry
     * @return
     */
    public String getCaption() {

        return caption;
    }

    /**
     * Payload to be used to distinguish which option was selected
     * @return
     */
    public Object getPayload() {
        return payload;
    }

    /**
     * 
     * @param caption to display as a menu entry
     * @param payload to be used to distinguish which option was selected
     */
    public MenuOption(String caption, Object payload) {
        this.caption = caption;
        this.payload = payload;
    }
}
