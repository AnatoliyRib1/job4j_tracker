package ru.job4j;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class SingleTracker {
    private Tracker tracker = new Tracker();

    private SingleTracker() {
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public boolean replaceItem(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean deleteItem(int id) {
        return tracker.delete(id);
    }

}
