package de.uniba.dsam.task1.controller;

import de.uniba.dsam.task1.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "movies")
public class MovieController {
    private List<Movie> movies;

    public MovieController() {
        this.movies = new ArrayList<>();
        // init movie list
        this.movies.add(new Movie("1", "Inception", false, 2010, "https://cdn.pixabay.com/photo/2017/05/15/17/43/calm-2315559_960_720.jpg"));
        this.movies.add(new Movie("2", "Cloud Atlas", false, 2012, "https://cdn.pixabay.com/photo/2020/03/02/16/19/vintage-4896141_960_720.jpg"));
        this.movies.add(new Movie());
    }

    @GetMapping
    public String getMovies(Model model) {

        model.addAttribute("movies", this.movies);

        return "moviesHtml";
    }
}
