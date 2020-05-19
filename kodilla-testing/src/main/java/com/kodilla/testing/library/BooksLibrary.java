package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BooksLibrary {
    LibraryDB libraryDB;

    public BooksLibrary(LibraryDB libraryDB) {
        this.libraryDB = libraryDB;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {

        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDB.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookList = libraryDB.listBooksInHandsOf(libraryUser);
        return bookList;
    }
}
