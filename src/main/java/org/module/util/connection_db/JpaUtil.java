package org.module.util.connection_db;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface JpaUtil {

    public static EntityManager openConection() {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("supermarket");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager;
    }

    public static void closeConection(EntityManager entityManager) {
        entityManager.getEntityManagerFactory().close();
        entityManager.close();
    }

}
