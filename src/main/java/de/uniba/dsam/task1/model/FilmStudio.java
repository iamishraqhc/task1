package de.uniba.dsam.task1.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class FilmStudio {
    private String id;
    private String name;
    private Date since;
    private List<Movie> movies;
}
