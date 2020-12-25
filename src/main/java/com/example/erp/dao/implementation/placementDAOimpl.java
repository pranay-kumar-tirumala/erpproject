package com.example.erp.dao.implementation;

import com.example.erp.bean.placement;
import com.example.erp.dao.placementDAO;
import com.example.erp.utils.SessionUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class placementDAOimpl implements placementDAO {

    @Override
    public void addPlacement(placement p)
    {
        Session session = SessionUtils.getSession();
        try
        {
            Transaction transaction = session.beginTransaction();
            session.save(p);
            transaction.commit();
        }
        catch (HibernateException exception){
            System.out.print(exception.getLocalizedMessage());
        }
        finally {
            session.close();
        }
    }

}
