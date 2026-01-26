package com.example.databaseJPA.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data //Genera getters y setters automaticamente, equals, hashcode, toString y un constructor
@SuperBuilder
@Entity
// @Table(name = "AUTHOR_TBL")
@NoArgsConstructor
@AllArgsConstructor
public class Course extends BaseEntity {


    private String name;

    private String description;

    
    @ManyToMany
    @JoinTable(
        name = "authors_courses",
        joinColumns = @JoinColumn(name = "course_id"),
        inverseJoinColumns = @JoinColumn(name = "author_id")
        )
    private List<Author> authors;

    @OneToMany(mappedBy = "course")
    private List<Section> sections;



}
