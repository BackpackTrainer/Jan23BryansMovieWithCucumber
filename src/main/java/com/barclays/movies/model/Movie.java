package com.barclays.movies.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "MOVIE")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String title;

    @NotBlank
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "TYPE_ID")
    MovieType movieType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setMovieType(MovieType type) {
        this.movieType = type;
    }

    public MovieType getMovieType() {
        return movieType;
    }
}
