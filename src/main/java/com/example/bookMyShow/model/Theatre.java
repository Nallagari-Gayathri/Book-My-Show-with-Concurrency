package com.example.bookMyShow.model;

import com.example.bookMyShow.model.constants.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
@Getter
@Setter
@Entity
public class Theatre extends BaseModel {
    private String name;
    private String address;
    @OneToMany
    List<Auditorium> auditoriums;
}
