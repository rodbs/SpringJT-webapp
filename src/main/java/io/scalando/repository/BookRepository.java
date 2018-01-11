package io.scalando.repository;

import org.springframework.data.repository.CrudRepository;

import io.scalando.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}

