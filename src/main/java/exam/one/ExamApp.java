package exam.one;

import javax.persistence.*;

public class ExamApp {

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
