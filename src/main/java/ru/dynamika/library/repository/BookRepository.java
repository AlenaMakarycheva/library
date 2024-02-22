package ru.dynamika.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dynamika.library.repository.model.Book;

public interface BookRepository  extends JpaRepository<Book, Long> {
}
