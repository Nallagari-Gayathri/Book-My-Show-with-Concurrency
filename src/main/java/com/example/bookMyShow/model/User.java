package com.example.bookMyShow.model;

import com.example.bookMyShow.model.constants.BaseModel;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity(name = "User_Table")
public class User extends BaseModel {
    private String name;
    private String email;
    private String phone_number;
    @OneToMany
    private List<Ticket> tickets;
}
