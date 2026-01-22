package com.example.databaseJPA.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.TableGenerator;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Getter
// @Setter 
@NoArgsConstructor
// @AllArgsConstructor
@Data //Genera getters y setters automaticamente, equals, hashcode, toString y un constructor
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,
        generator = "author_sequence"
    )
    // @SequenceGenerator(
    //     name = "author_sequence",
    //     sequenceName = "author_sequence",
    //     allocationSize = 1
    // )
    @TableGenerator(
        name = "author_sequence",
        table = "id_generator",
        pkColumnName = "id_name",
        valueColumnName = "id_value",
        allocationSize = 1
    )
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;


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