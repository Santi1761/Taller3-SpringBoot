package icesi.edu.co.LibrarySystem.persistence.services;

import icesi.edu.co.LibrarySystem.persistence.models.Book;
import icesi.edu.co.LibrarySystem.persistence.repositories.BookRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }

    public List<Book> findByAuthor(Long author) {
        return bookRepository.findByAuthorId(author);
    }

    public Book findById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public Book update(Long id, Book updatedBook) {

        Book existingBook = bookRepository.findById(id).orElse(null);

        if (existingBook != null) {

            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setPublicationDate(updatedBook.getPublicationDate());
            existingBook.setAuthor(updatedBook.getAuthor());


            return bookRepository.save(existingBook);
        } else {

            return null;
        }
    }

    public void delete(Long id) {

        bookRepository.deleteById(id);
    }
}

