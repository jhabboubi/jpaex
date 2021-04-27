package org.perscholas;

import org.perscholas.models.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainRunner {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Jpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Employee e = new Employee("Jafer", 2000.0D, "E-Commerce");
        em.persist(e);
        em.getTransaction().commit();
        em.close();

    }
}
