package repository;

import org.springframework.data.repository.CrudRepository;

import io.scalando.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
