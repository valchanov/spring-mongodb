package com.example.springmongodb.bookcatalog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class BookCatalogService {
    private final BookCatalogRepository bookCatalogRepository;

    public Flux<BookCatalog> getAllBooks() {
        return bookCatalogRepository.findAll();
    }

    public Mono<BookCatalog> getByBookId(Long bookId) {
        return bookCatalogRepository.findByBookId(bookId);
    }
}
