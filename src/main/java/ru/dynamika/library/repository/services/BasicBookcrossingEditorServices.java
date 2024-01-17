package ru.dynamika.library.repository.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dynamika.library.repository.BookcrossingRepository;
import ru.dynamika.library.repository.model.Bookcrossing;

import java.util.Calendar;

/**
 * Сервис отвечает за базовые изменения каталога книг
 */
@Service
@RequiredArgsConstructor
public class BasicBookcrossingEditorServices {

    private final BookcrossingRepository bookcrossingRepository;

    public void save(Bookcrossing bookcrossing){
        bookcrossing.setStartdate(Calendar.getInstance().getTime());
        bookcrossingRepository.save(bookcrossing);
    }

}
