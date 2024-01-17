package ru.dynamika.library;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.dynamika.library.repository.BookRepository;
import ru.dynamika.library.repository.BookcrossingRepository;
import ru.dynamika.library.repository.ClientRepository;
/*
@Component
@RequiredArgsConstructor
public class DataLoader implements ApplicationRunner {

    private BookcrossingRepository;
    private BookRepository;
    private ClientRepository clientRepository;

    @Autowired
    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void run(ApplicationArguments args) {
        userRepository.save(new User("lala", "lala", "lala"));
    }
}*/