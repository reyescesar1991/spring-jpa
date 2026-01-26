package com.example.databaseJPA.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

// @Getter
// @Setter 
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data //Genera getters y setters automaticamente, equals, hashcode, toString y un constructor
@Entity
// @Table(name = "AUTHOR_TBL")
@SuperBuilder
public class Author extends BaseEntity {

    // @Id
    // @GeneratedValue
    // private Integer id;
    /*(strategy = GenerationType.TABLE, // Tipo de generacion de la clave primaria
        generator = "author_sequence" // Nombre del generador de secuencia
    )*/
    // @SequenceGenerator(
    //     name = "author_sequence",
    //     sequenceName = "author_sequence",
    //     allocationSize = 1
    // )
    /* 
    @TableGenerator(
        name = "author_sequence", // Nombre de la tabla
        table = "id_generator", // Nombre de la tabla de almacenamiento de la secuencia
        pkColumnName = "id_name", // Nombre de la columna que almacena el nombre de la tabla
        valueColumnName = "id_value",  // Nombre de la columna que almacena el valor de la secuencia
        allocationSize = 1 // Tamaño de la secuencia
    )*/

    @Column(
        name = "first_name", // Nombre de la columna en la base de datos
        length = 35
    )
    private String firstName;
    private String lastName;

    @Column(
        unique = true, // No puede haber dos registros con el mismo valor
        nullable = false, // No puede ser nulo
        length = 50
    )
    private String email;
    private Integer age;

    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

    // Getters and setters

    // public Integer getId() {
    //     return id;
    // }   

    // public String getFirstName() {
    //     return firstName;
    // }

    // public void setFirstName(String firstName) {
    //     this.firstName = firstName;
    // }

    // public String getLastName() {
    //     return lastName;
    // }

    // public void setLastName(String lastName) {
    //     this.lastName = lastName;
    // }

    // public Integer getAge() {
    //     return age;
    // }

    // public void setAge(Integer age) {
    //     this.age = age;
    // }

    // public String getEmail() {
    //     return email;
    // }

    // public void setEmail(String email) {
    //     this.email = email;
    // }
}