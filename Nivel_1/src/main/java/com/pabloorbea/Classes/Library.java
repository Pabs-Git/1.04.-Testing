package com.pabloorbea.Classes;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> bookCollection;

    public Library() {
        bookCollection = new ArrayList<>();
    }

    public void addBook(String title) {

        boolean found = false;
        int i = 0;

            while (!found && i < bookCollection.size()) {

                if (title.equals(bookCollection.get(i).getTitle())) {
                    found = true;
                }
                i++;
            }
            if (!found) {
                bookCollection.add(new Book(title));
            }
        }

    public List<Book> getBookCollection() {
        return bookCollection;
    }
    public String getBook(int index) {
       return bookCollection.get(index).getTitle();
    }
    public void addBookToIndex(int index, String title) {

        boolean found = false;
        int i = 0;

        while (!found && i<=bookCollection.size()) {

            if (title.equals(bookCollection.get(i).getTitle())) {
                found = true;
            }
            i++;
        }
        if (!found) {
            bookCollection.add(index, new Book(title));
        }
    }

    public void removeBook(String title) {

        boolean found = false;
        int i = 0;

        while (!found && i<=bookCollection.size()) {

            if (title.equals(bookCollection.get(i).getTitle())) {
                found = true;
                bookCollection.remove(i);
            }
            i++;
        }
        if (!found) {
            System.out.println("Book not found");
        }
    }
}
