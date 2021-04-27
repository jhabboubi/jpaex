package org.perscholas.dao;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Getter @Setter
@NoArgsConstructor

@Entity
@DiscriminatorValue("NS")
public class NonTeachingStaff extends Staff{


    //fields

    String areaExperience;

    public NonTeachingStaff(int sId, String sName, String areaExperience) {
        super(sId, sName);
        this.areaExperience = areaExperience;
    }
}
