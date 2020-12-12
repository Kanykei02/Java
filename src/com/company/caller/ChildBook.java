package com.company.caller;

import com.company.library.Book;

public class ChildBook extends Book {
    public void method() {
        Book book = new Book();
        setNeedsRepair(true);
    }
}
