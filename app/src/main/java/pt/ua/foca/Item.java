package pt.ua.foca;

import java.io.Serializable;
import java.util.*;

/**
 * Created by Pedro Nunes
 */

class Item implements Serializable {
    private static final long serialVersionUID = -1213949467658913456L;
    private String title;
    private Canteen[] body;
    private static ArrayList<Item> items = new ArrayList<>();

    private Item(String title, Canteen[] body) {
        this.title = title;
        this.body = body;
    }

    private String getTitle() {
        return title;
    }

    Canteen[] getBody() {
        return body;
    }

    @Override
    public String toString() {
        return getTitle();
    }

    static ArrayList<Item> getItems() {
        return items;
    }

    static void addItem(String day, Canteen[] content) {
        items.add(new Item(day, content));
    }
}
