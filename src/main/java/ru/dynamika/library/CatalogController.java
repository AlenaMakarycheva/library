package ru.dynamika.library;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.dynamika.library.repository.model.Book;
import ru.dynamika.library.repository.services.BasicCatalogEditorServices;
import ru.dynamika.library.repository.services.CatalogViewServices;


@Controller
@RequiredArgsConstructor
public class CatalogController {

    private final BasicCatalogEditorServices basicCatalogEditorServices;
    private final CatalogViewServices catalogViewServices;

    @GetMapping("/catalog")
    public String getCatalog(Model model){
        model.addAttribute("books", catalogViewServices.showAll());
        return "catalog";
    }


    @GetMapping("/new_book")
    public String newBookForm(Model model){
        model.addAttribute("book", new Book());
        return "new_book";
    }

    @RequestMapping(value = "/save_book", method = RequestMethod.POST)
    public String saveBook(@ModelAttribute("book") Book book) {
        basicCatalogEditorServices.save(book);
        return "redirect:/catalog";
    }

    @GetMapping("/edit_book")
    public String editBookForm(@RequestParam long bookId,Model model){
        model.addAttribute("book", catalogViewServices.showByID(bookId));
        return "edit_book";
    }

    @RequestMapping(value = "/update_book", method = RequestMethod.POST)
    public String saveEditBook(@ModelAttribute("book") Book book) {
        basicCatalogEditorServices.update(book);
        return "redirect:/catalog";
    }

    @GetMapping("/delete_book")
    public String deleteBookForm(@RequestParam long bookId){
        basicCatalogEditorServices.delete(bookId);
        return "redirect:/catalog";
    }

}
