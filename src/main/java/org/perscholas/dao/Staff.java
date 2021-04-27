package org.perscholas.dao;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class Staff {

    //fields
    @Id
    int sId;
    String sName;
    public Staff(){}
    public Staff(int sId,String sName){
        this.sId = sId;
        this.sName = sName;
    }


}
