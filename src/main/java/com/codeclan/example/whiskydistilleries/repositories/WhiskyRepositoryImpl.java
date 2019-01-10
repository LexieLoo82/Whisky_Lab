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

public class WhiskyRepositoryImpl implements WhiskyRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    public List<Whisky> getAllWhiskiesByYear (int year){
        List<Whisky> results = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Whisky.class);
            cr.add(Restrictions.eq("year", year));
            results = cr.list();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }
        return results;
    }


    public List<Whisky> getAllWhiskiesByRegion (String region){
        List<Whisky> results = null;
        Session session = entityManager.unwrap(Session.class);

        try{
            Criteria cr = session.createCriteria(Whisky.class);
            cr.createAlias("distillery", "distillery");
            cr.add(Restrictions.eq("distillery.region", region));
            results = cr.list();
        }catch(HibernateException ex){
            ex.printStackTrace();
        }
        return results;
    }

}
