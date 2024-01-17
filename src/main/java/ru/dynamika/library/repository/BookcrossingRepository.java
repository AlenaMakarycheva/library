package ru.dynamika.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dynamika.library.repository.model.Bookcrossing;

public interface BookcrossingRepository extends JpaRepository<Bookcrossing, Long> {
}