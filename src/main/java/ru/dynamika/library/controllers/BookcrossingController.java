package ru.dynamika.library.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.dynamika.library.repository.model.Bookcrossing;
import ru.dynamika.library.services.BasicBookcrossingEditorServices;

@Controller
@RequiredArgsConstructor
public class BookcrossingController {

    private final BasicBookcrossingEditorServices basicBookcrossingEditorServices;


    @GetMapping("/bookcrossing")
    public String getBookcrossingForm(Model model){
        model.addAttribute("bookcrossing", new Bookcrossing());
        return "bookcrossing";
    }

    @RequestMapping(value = "/get_book", method = RequestMethod.POST)
    public String saveBookcrossing(@ModelAttribute("bookcrossing") Bookcrossing bookcrossing) {
        basicBookcrossingEditorServices.save(bookcrossing);
        return "redirect:/";
    }
}
