package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        Item[] newItem = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item name = items[index];
            if (name != null) {
                newItem[size] = name;
                size++;
            }
        }
        newItem = Arrays.copyOf(newItem, size);
        return newItem;
    }

    public Item[] findByName(String key) {
        Item[] newItem = new Item[items.length];
        int num = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                newItem[index] = item;
                num++;
            }
        }
        newItem = Arrays.copyOf(newItem, num);
        return newItem;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            item.setId(id);
            items[index] = item;
        }
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}