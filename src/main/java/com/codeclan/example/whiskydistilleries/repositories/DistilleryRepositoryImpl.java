package com.codeclan.example.whiskydistilleries.repositories;


import com.codeclan.example.whiskydistilleries.models.Distillery;
import com.codeclan.example.whiskydistilleries.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;


public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    public List<Distillery> getDistilleriesByRegion(String region) {
        List<Distillery> results = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Distillery.class);
            cr.add(Restrictions.eq("region", region));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return results;
    }


    public List<Whisky> getWhiskyfromDistilleryByAge(Distillery distillery, int age) {
        List<Whisky> results = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Whisky.class);
            cr.createAlias("whisky", "whiskies");
            cr.add(Restrictions.eq("whisky.age", age));
            cr.add(Restrictions.eq("distillery", distillery));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return results;
    }
}

