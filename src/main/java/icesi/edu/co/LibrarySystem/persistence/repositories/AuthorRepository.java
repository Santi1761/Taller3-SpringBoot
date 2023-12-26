package icesi.edu.co.LibrarySystem.persistence.repositories;

import icesi.edu.co.LibrarySystem.persistence.models.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
    List<Author> findByName(String name);
}
