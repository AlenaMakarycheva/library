package ru.dynamika.library.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.dynamika.library.repository.model.Client;
import ru.dynamika.library.services.BasicClientBaseEditorServices;
import ru.dynamika.library.services.ClientBaseViewServices;

@Controller
@RequiredArgsConstructor
public class ClientBaseController {

    private final BasicClientBaseEditorServices basicClientBaseEditorServices;
    private final ClientBaseViewServices clientBaseViewServices;

    @GetMapping("/client_base")
    public String getClientBase(Model model){
        model.addAttribute("clients", clientBaseViewServices.showAll());
        return "client_base";
    }

    @GetMapping("/new_client")
    public String newClientForm(Model model){
        model.addAttribute("client", new Client());
        return "new_client";
    }

    @RequestMapping(value = "/save_client", method = RequestMethod.POST)
    public String saveClient(@ModelAttribute("client") Client client) {
        basicClientBaseEditorServices.save(client);
        return "redirect:/client_base";
    }

    @GetMapping("/edit_client")
    public String editClientForm(@RequestParam long clientId,Model model){
        model.addAttribute("client", clientBaseViewServices.showByID(clientId));
        return "edit_client";
    }

    @RequestMapping(value = "/update_client", method = RequestMethod.POST)
    public String saveEditClient(@ModelAttribute("client") Client client) {
        basicClientBaseEditorServices.update(client);
        return "redirect:/client_base";
    }

    @GetMapping("/delete_client")
    public String deleteClientForm(@RequestParam long clientId){
        basicClientBaseEditorServices.delete(clientId);
        return "redirect:/client_base";
    }

}
