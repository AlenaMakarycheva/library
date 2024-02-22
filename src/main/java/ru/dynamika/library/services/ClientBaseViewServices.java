package ru.dynamika.library.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dynamika.library.repository.ClientRepository;
import ru.dynamika.library.repository.model.Book;
import ru.dynamika.library.repository.model.Client;

import java.util.List;

/**
 * Сервис отвечает за просмотр клиентов
 */
@Service
@RequiredArgsConstructor
public class ClientBaseViewServices {

    private final ClientRepository clientRepository;

    public List<Client> showAll(){
        return clientRepository.findAll();
    }

    public Client showByID(long ID){
        return clientRepository.findById(ID).orElseThrow(() -> new IllegalArgumentException("Нет клиента с ID " + ID));
    }

}
