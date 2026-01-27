package com.example.databaseJPA.models;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@NoArgsConstructor
@AllArgsConstructor
@Data //Genera getters y setters automaticamente, equals, hashcode, toString y un constructor
@Entity
// @Table(name = "AUTHOR_TBL")
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED) //Tipo de herencia que se va a usar
// //Nombre de la columna que va a almacenar el tipo de recurso solo con Singled table
public class Resource {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int size;

    private String url;

    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;
}
