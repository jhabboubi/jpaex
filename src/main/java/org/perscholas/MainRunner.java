package org.perscholas;

import org.perscholas.dao.NonTeachingStaff;
import org.perscholas.dao.TeachingStaff;
import org.perscholas.models.Employee;
import org.perscholas.services.EmployeeService;
import org.perscholas.util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class MainRunner {
    public static void main(String[] args) {


      /*  EmployeeService es = new EmployeeService();
        Employee e = new Employee("LeAh", 2000.0D, "E-Commerce");
        es.createEmp(e);*/

        EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TeachingStaff ts = new TeachingStaff(1, "jafer", "h", "hh");
        NonTeachingStaff ns = new NonTeachingStaff(2,"Tim", "Java");
        em.persist(ts);
        em.persist(ns);

        em.getTransaction().commit();
        em.close();
    }
}
