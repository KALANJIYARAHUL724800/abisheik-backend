package com.example.abisheik_backend.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="details")
public class MainModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String city;

}
