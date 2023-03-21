package com.example.springmongodb.bookcatalog;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/book-catalog")
@RequiredArgsConstructor
public class BookCatalogController {
    private final BookCatalogService bookCatalogService;
    @GetMapping
    Flux<BookCatalog> getAll(){
        return bookCatalogService.getAllBooks();
    }

    @GetMapping("{bookId}")
    Mono<BookCatalog> getByBookId(@PathVariable Long bookId){
        return bookCatalogService.getByBookId(bookId);
    }
}
