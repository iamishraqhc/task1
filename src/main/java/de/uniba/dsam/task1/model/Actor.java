package de.uniba.dsam.task1.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Actor {
    private String id;
    private String name;
    private boolean wonOscar;
    private LocalDate birthday;
}
