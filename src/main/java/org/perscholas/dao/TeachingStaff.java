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
    public TeachingStaff(int sId, String sName, String qualification,String subjectExpertise){
        super(sId, sName);
        this.qualification = qualification;
        this.subjectExpertise = subjectExpertise;
    }


}
