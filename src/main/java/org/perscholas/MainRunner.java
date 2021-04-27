package org.perscholas;


import org.perscholas.dao.TeachingStaff;

import org.perscholas.models.Employee;
import org.perscholas.services.EmployeeService;
import org.perscholas.util.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class MainRunner {
    public static void main(String[] args) {


        EmployeeService es = new EmployeeService();



       /* Employee e = new Employee("LeAh", 2000.0D, "E-Commerce");
        Employee e2 = new Employee("robert", 3000.0D, "Full Stack developer");
        Employee e3 = new Employee("jafer", 2000.0D, "Management");
        es.createEmp(e);
        es.createEmp(e2);
        es.createEmp(e3);*/


        Employee eDelete = es.findById(3);
        System.out.println(eDelete);
        es.deleteEmp(eDelete);

        //Employee ee = es.findById(e2.getEId());
       // System.out.println(ee);



        /*EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TeachingStaff ts = new TeachingStaff( "jafer", "h", "hh");
        //NonTeachingStaff ns = new NonTeachingStaff("Tim", "Java");
        em.persist(ts);
        em.flush();
        System.out.println("ID for TS is: "+ts.getSId());

        //em.persist(ns);

        em.getTransaction().commit();
        em.close();*/
    }
}
