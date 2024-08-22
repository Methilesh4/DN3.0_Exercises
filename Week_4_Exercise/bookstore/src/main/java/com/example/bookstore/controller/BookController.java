package com.example.bookstore.controller;

import com.example.bookstore.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public List<Book> getAllBooks() {
        
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return ResponseEntity.status(HttpStatus.CREATED)
                             .header("Custom-Header", "CustomHeaderValue")
                             .body(book);
    }


    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        // Implementation here
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        // Implementation here
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        // Implementation here
    }

    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam(required = false) String title, @RequestParam(required = false) String author) {
        // Implementation here
    }
    
}
