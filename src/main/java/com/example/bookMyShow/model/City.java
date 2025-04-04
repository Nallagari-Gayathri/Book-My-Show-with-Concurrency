package com.example.bookMyShow.model;

import com.example.bookMyShow.model.constants.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class City extends BaseModel {
    @Column(name="CityName")
    private String name;
    @OneToMany
    List<Theatre> theatres;
}
