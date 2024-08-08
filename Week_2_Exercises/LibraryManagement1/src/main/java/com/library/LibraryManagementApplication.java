package com.library;

import com.library.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            // BookService bookService = context.getBean(BookService.class);
            BookService bookService = context.getBean(BookService.class);
            System.out.println("Spring context loaded and BookService bean: " + bookService);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
