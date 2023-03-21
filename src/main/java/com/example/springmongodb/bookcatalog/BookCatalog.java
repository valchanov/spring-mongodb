package com.example.springmongodb.bookcatalog;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document(collection = "book-catalog")
public class BookCatalog {
    @Id
    private ObjectId id;
    private Long bookId;
    private String isbn;
    private BigDecimal price;
}
