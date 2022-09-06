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
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
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
}