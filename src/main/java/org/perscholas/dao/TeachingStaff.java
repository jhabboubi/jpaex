package org.perscholas.dao;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Getter
@Setter

@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@DiscriminatorValue("TS")
public class TeachingStaff extends Staff{
    String qualification;
    String subjectExpertise;

    public TeachingStaff() {}
    public TeachingStaff(String sName, String qualification,String subjectExpertise){
        super(sName);
        this.qualification = qualification;
        this.subjectExpertise = subjectExpertise;
    }


}
