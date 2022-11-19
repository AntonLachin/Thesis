package com.work.diploma;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connect {
    private static Connect instance;
    private final EntityManagerFactory sessionFactory;

    public static Connect getInstance(){
      if (instance == null) {
        instance = new Connect();
      }
      return instance;
    }

    private Connect (){
        sessionFactory = Persistence.createEntityManagerFactory( "com.work.diploma.jpa");
    }

    public EntityManager createEntityManager(){
        return sessionFactory.createEntityManager();
    }
}
