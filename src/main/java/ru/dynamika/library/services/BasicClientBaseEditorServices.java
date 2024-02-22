package ru.dynamika.library.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dynamika.library.repository.ClientRepository;
import ru.dynamika.library.repository.model.Client;

import java.util.Date;


/**
 * Сервис отвечает за базовые изменения клиентов
 */
@Service
@RequiredArgsConstructor
public class BasicClientBaseEditorServices {

    private final ClientRepository clientRepository;

    public void save(Client client){
        clientRepository.save(client);
    }

    public void update(Client clientUp){
        if(!clientRepository.existsById(clientUp.getId())){new IllegalArgumentException("Нет клиента с ID " + clientUp.getId());}
        clientRepository.save(clientUp);
    }

    public void delete(long id){
        clientRepository.deleteById(id);
    }
}
