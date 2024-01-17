package ru.dynamika.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dynamika.library.repository.model.Client;

public interface ClientRepository  extends JpaRepository<Client, Long> {
}
