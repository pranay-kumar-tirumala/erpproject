package com.example.erp.dao.implementation;

import com.example.erp.bean.placement_student;
import com.example.erp.dao.placStudDAO;
import com.example.erp.utils.SessionUtils;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class placStudDAOimpl implements placStudDAO {

    @Override
    public void addPlacStud(placement_student ps)
    {
        Session session = SessionUtils.getSession();
        try
        {
            Transaction transaction = session.beginTransaction();
            session.save(ps);
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
