package com.example.databaseJPA.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data //Genera getters y setters automaticamente, equals, hashcode, toString y un constructor
@Entity
// @Table(name = "AUTHOR_TBL")
@SuperBuilder
//@DiscriminatorValue("V") // Sirve para identificar el tipo de recurso que se va a guardar en la base de datos
public class Video extends Resource {

    private int length;
}
