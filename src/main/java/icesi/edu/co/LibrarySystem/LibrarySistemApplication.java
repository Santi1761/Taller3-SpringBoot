package icesi.edu.co.LibrarySystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("icesi.edu.co.LibrarySystem.config")
public class LibrarySistemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibrarySistemApplication.class, args);
    }
}
