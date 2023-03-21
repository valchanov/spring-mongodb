package com.example.springmongodb.book;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
    @GetMapping
    Flux<Book> getAll(){
        return bookService.getAllBooks();
    }

    @GetMapping("{bookId}")
    Mono<Book> getByBookId(@PathVariable Long bookId){
        return bookService.getByBookId(bookId);
    }
}
