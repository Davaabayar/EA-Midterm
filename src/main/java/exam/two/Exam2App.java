package exam.two;

import javax.persistence.*;

public class Exam2App {

    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("cs544");
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//
//        em.getTransaction().commit();
//        em.close();
    }
}