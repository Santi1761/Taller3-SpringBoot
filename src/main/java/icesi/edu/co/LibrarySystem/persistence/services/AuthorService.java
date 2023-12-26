package icesi.edu.co.LibrarySystem.persistence.services;

import icesi.edu.co.LibrarySystem.persistence.models.Author;
import icesi.edu.co.LibrarySystem.persistence.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public Author save(Author author) {
        return authorRepository.save(author);
    }

    public List<Author> findAll() {
        return (List<Author>) authorRepository.findAll();
    }

    public Author update(Long id, Author updatedAuthor) {

        Author existingAuthor = authorRepository.findById(id).orElse(null);

        if (existingAuthor != null) {

            existingAuthor.setName(updatedAuthor.getName());
            existingAuthor.setNationality(updatedAuthor.getNationality());

            return authorRepository.save(existingAuthor);
        } else {

            return null;
        }
    }

    public void deleteById(Long id) {
        Optional<Author> authorOptional = authorRepository.findById(id);
        if (authorOptional.isPresent()) {
            authorRepository.deleteById(id);
        } else {

        }
    }

    public Author findById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        authorRepository.deleteById(id);
    }
}
