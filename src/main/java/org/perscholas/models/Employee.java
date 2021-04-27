package org.perscholas.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter @Setter
@ToString
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@Entity
public class Employee {

    //fields
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(columnDefinition = "INT(11) UNSIGNED")
    int eId;
    String eName;
    double eSalary;
    String eDegree;

    public Employee(String eName,double eSalary,String eDegree){
        this.eName = eName;
        this.eSalary = eSalary;
        this.eDegree = eDegree;
    }

}
