package org.perscholas.services;

import lombok.extern.log4j.Log4j;
import org.perscholas.dao.IEmployee;
import org.perscholas.models.Employee;
import org.perscholas.util.JpaUtil;

import javax.persistence.*;
import java.util.List;
import java.util.Locale;

@Log4j
public class EmployeeService implements IEmployee {
    @Override
    public void createEmp(Employee e) {
        // cleanup

        e.setEName(e.getEName().toLowerCase().trim());
        // open connection
        EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        // session
        EntityManager em = emf.createEntityManager();
        //transaction
        try {

            em.getTransaction().begin();
            em.persist(e);
            em.getTransaction().commit();

        }catch(RollbackException ex){
            ex.printStackTrace();
            log.error("if the commit fails");
        }
        catch(EntityExistsException ex){
            ex.printStackTrace();
            log.error("General");
            em.getTransaction().rollback();
        } catch(TransactionRequiredException ex){
            em.getTransaction().rollback();
            ex.printStackTrace();
            log.error("if the entity already exists. (If the entity already exists, the EntityExistsException may be thrown when the persist operation is invoked, or the EntityExistsException or another PersistenceException may be thrown at flush or commit time.");
        } catch(IllegalArgumentException ex){
            em.getTransaction().rollback();
            ex.printStackTrace();
            log.error("if the instance is not an entity");

        }finally {
            //close everything
            em.close();
            JpaUtil.shutdown();
        }


    }

    @Override
    public List<Employee> readEmp() {
        return null;
    }

    @Override
    public void updateEmp(Employee e) {

    }

    @Override
    public void deleteEmp(Employee e) {

    }
}
