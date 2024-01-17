package ru.dynamika.library;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dynamika.library.repository.model.Bookcrossing;
import ru.dynamika.library.repository.services.BookcrossingViewServices;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestJSONController {

    private final BookcrossingViewServices bookcrossingViewServices;

    @GetMapping("/JSON")
    public List<Bookcrossing> getJSON(){
        return bookcrossingViewServices.showAll();
    }

}
