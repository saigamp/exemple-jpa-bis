package fr.saigamp.exemplejpabis.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.saigamp.exemplejpabis.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByName(String name);

}