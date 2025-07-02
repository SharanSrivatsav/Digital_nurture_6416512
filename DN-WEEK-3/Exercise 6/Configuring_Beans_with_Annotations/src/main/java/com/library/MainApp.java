package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Bean names are usually camelCase of class names unless explicitly named
        BookService bookService = context.getBean(BookService.class);

        bookService.addBook("Annotation-based Spring, Let's Goooo ");
    }
}
