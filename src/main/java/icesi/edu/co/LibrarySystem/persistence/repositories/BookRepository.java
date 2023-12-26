package icesi.edu.co.LibrarySystem.persistence.repositories;
import icesi.edu.co.LibrarySystem.persistence.models.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByAuthorId(Long authorId);
}


