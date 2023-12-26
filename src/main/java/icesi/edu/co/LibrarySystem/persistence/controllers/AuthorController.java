package icesi.edu.co.LibrarySystem.persistence.controllers;

import icesi.edu.co.LibrarySystem.config.JwtTokenProvider;
import icesi.edu.co.LibrarySystem.persistence.models.AuthRequest;
import icesi.edu.co.LibrarySystem.persistence.models.Author;
import icesi.edu.co.LibrarySystem.persistence.services.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/autores")
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public Author save(@RequestBody Author author) {
        return authorService.save(author);
    }

    @GetMapping
    public List<Author> findAll() {
        return authorService.findAll();
    }

    @GetMapping("/{id}")
    public Author findById(@PathVariable Long id) {
        return authorService.findById(id);
    }

    @PutMapping("/{id}")
    public Author update(@PathVariable Long id, @RequestBody Author author) {
        return authorService.update(id, author);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        authorService.delete(id);
    }

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenProvider jwtTokenProvider;
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody AuthRequest data) {
        try {
            String username = data.getUsername();
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, data.getPassword()));
            String token = jwtTokenProvider.createToken(username, getUserRoles(username));
            return ResponseEntity.ok(token);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }

    public List<String> getUserRoles(String username) {

        List<String> roles = new ArrayList<>();


        if ("admin".equals(username)) {
            roles.add("ROLE_ADMIN");
            roles.add("ROLE_USER");
        } else {
            roles.add("ROLE_USER");
        }

        return roles;
    }
}

