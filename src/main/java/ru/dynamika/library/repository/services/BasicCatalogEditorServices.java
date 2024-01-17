package ru.dynamika.library.repository.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dynamika.library.repository.BookRepository;
import ru.dynamika.library.repository.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис отвечает за базовые изменения каталога книг
 */
@Service
@RequiredArgsConstructor
public class BasicCatalogEditorServices {

    private final BookRepository bookRepository;
    public void save(Book book){
        bookRepository.save(book);
    }

    public void update(Book book){
        if(!bookRepository.existsById(book.getId())){new IllegalArgumentException("Нет клиента с ID " + book.getId());}
        bookRepository.save(book);
    }

    public void delete(long id){
        bookRepository.deleteById(id);
    }
}
