package de.uniba.dsam.task1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private String id;
    private String title;
    private boolean wonOscar;
    private int year;
    private String coverImage;
}
