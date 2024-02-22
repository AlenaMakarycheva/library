package ru.dynamika.library.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dynamika.library.repository.BookcrossingRepository;
import ru.dynamika.library.repository.model.Bookcrossing;

import java.util.List;

/**
 * Сервис отвечает за просмотр каталога книг
 */
@Service
@RequiredArgsConstructor
public class BookcrossingViewServices {

    private final BookcrossingRepository bookcrossingRepository;

    public List<Bookcrossing> showAll(){
        return bookcrossingRepository.findAll();
    }

}
