package com.example.bookMyShow.model;

import com.example.bookMyShow.model.constants.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Cast extends BaseModel {
    private String name;
    private String description;
    @ManyToMany
    private List<Movie> movies;
}
