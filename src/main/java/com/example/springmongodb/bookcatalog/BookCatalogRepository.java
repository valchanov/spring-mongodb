package com.example.springmongodb.bookcatalog;

import org.bson.types.ObjectId;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface BookCatalogRepository extends ReactiveCrudRepository<BookCatalog, ObjectId> {
    Mono<BookCatalog> findByBookId(Long bookId);
}
