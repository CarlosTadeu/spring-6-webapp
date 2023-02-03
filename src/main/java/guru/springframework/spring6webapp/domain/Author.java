package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String firstNane;
    private String lastNane;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new LinkedHashSet<>();

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstNane() {
        return firstNane;
    }

    public void setFirstNane(String firstNane) {
        this.firstNane = firstNane;
    }

    public String getLastNane() {
        return lastNane;
    }

    public void setLastNane(String lastNane) {
        this.lastNane = lastNane;
    }
}
