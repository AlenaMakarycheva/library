package ru.dynamika.library.repository.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "ID")
    private long id;

    @Column (name = "name")
    private String name;

    @Column (name = "author")
    private String author;

    @Column (name = "isbn")
    private String isbn;
}
