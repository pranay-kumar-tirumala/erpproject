package com.example.erp.service;

import com.example.erp.bean.organisations;
import com.example.erp.dao.implementation.orgDAOimpl;
import com.example.erp.dao.orgDAO;

public class orgService {
    orgDAO orgDAO = (orgDAO) new orgDAOimpl();

    public void addOrg(organisations o){
        orgDAO.addOrg(o);
    }

}
