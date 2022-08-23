package com.example.demo.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {

    private static EntityManagerFactory emf;

    //EntityManagerインスタンスを生成
    public static EntityManager createEntityManager() {
        return _getEntityManagerFactory().createEntityManager();
    }

    //EntityManagerFactoryインスタンスを生成
    private static EntityManagerFactory _getEntityManagerFactory() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("test_system");
        }

        return emf;
    }

}
