package ru.dynamika.library.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dynamika.library.ReportNode;
import ru.dynamika.library.repository.model.Book;
import ru.dynamika.library.repository.model.Bookcrossing;
import ru.dynamika.library.repository.model.Client;
import ru.dynamika.library.services.BookcrossingViewServices;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class RestJSONController {

    private final BookcrossingViewServices bookcrossingViewServices;

    private ReportNode getReportNode(Bookcrossing bookcrossing){
        ReportNode reportNote = new ReportNode();
        Book book = bookcrossing.getBook();
        Client client = bookcrossing.getClient();

        reportNote.setFio(client.getLastName()+" "+client.getFirstName()+" "+client.getPatronymic());
        reportNote.setBirthday(client.getBirthday());
        reportNote.setNameBook(book.getName());
        reportNote.setAuthorBook(book.getAuthor());
        reportNote.setIsbnBook(book.getIsbn());
        reportNote.setStartDate(bookcrossing.getStartDate());
        return reportNote;
    }

    @GetMapping("/JSON")
    public List<ReportNode> getJSON(){
        return bookcrossingViewServices.showAll().stream().map(this::getReportNode).collect(Collectors.toList());
    }

}
