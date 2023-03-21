package com.example.springmongodb.book;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "books")
public class Book {
    @Id
    private ObjectId id;
    private Long bookId;
    private String title;
    private String author;
    private String description;
}
