package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 450);
        Book tomSoyer = new Book("Tom Soyer", 500);
        Book totalWar = new Book("Total War", 150);
        Book knife = new Book("Knife", 333);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = tomSoyer;
        books[2] = totalWar;
        books[3] = knife;
        for (int i = 0; i < books.length; i++) {
            Book bookName = books[i];
            System.out.println(bookName.getName() + " имеет всего " + bookName.getPages() + " страниц.");
        }
        System.out.println(System.lineSeparator() + "Replace Clean Code to Knife." + System.lineSeparator());
        Book[] change = new Book[1];
        change[0] = books[0];
        books[0] = books[3];
        books[3] = change[0];
        for (int i = 0; i < books.length; i++) {
            Book bookName = books[i];
            System.out.println(bookName.getName() + " имеет всего " + bookName.getPages() + " страниц.");
        }
        for (int i = 0; i < books.length; i++) {
            if ("Clean Code".equals(books[i].getName())) {
                System.out.println(System.lineSeparator() + books[i].getName() + " имеет всего " + books[i].getPages() + " страниц.");
            }
        }
    }
}
