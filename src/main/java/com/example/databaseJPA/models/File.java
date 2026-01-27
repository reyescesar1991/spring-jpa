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
//@DiscriminatorValue("F")
public class File extends Resource{

    private String type;
}
