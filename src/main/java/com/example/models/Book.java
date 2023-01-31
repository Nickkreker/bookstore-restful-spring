package com.example.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "books")
public class Book {
    @Id
    private int id;
    private String title;
    private String author;
    private int published;

    public Book() {}

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublished() {
        return published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
