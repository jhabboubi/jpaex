package org.perscholas.dao;

import org.perscholas.models.Employee;

import java.util.List;

public interface IEmployee {

    // c
    void createEmp(Employee e);
    // r
    List<Employee> readEmp();
    // u
    void updateEmp(Employee e);
    //d
    void deleteEmp(Employee e);

    //custom
    Employee findById(int id);


}
