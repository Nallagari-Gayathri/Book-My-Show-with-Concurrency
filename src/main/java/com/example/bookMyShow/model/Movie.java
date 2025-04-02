package com.example.bookMyShow.model;

import com.example.bookMyShow.model.constants.BaseModel;
import com.example.bookMyShow.model.constants.MovieFeature;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String name;
    private String description;
    private String language;
    @ManyToMany
    private List<Cast> actors;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> movieFeatures;
}
/*
Movie Actor
1      M
M       1
 */
