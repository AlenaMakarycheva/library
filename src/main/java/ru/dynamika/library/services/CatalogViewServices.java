package ru.dynamika.library.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dynamika.library.repository.BookRepository;
import ru.dynamika.library.repository.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис отвечает за просмотр каталога книг
 */
@Service
@RequiredArgsConstructor
public class CatalogViewServices {

    private final BookRepository bookRepository;

    public List<Book> showAll(){
        return bookRepository.findAll();
    }

    public Book showByID(long ID){
        return bookRepository.findById(ID).orElseThrow(() -> new IllegalArgumentException("Нет книги с ID " + ID));
    }

}
