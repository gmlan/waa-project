/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.service.impl;

import edu.mum.cs545.lms.dao.CheckOutRecordDataAccess;
import edu.mum.cs545.lms.domain.CheckOutRecord;
import edu.mum.cs545.lms.service.CheckOutRecordService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mike
 */
@Service
public class CheckOutRecordServiceImpl implements CheckOutRecordService{
    
    @Autowired
    private CheckOutRecordDataAccess checkOutRecordDao;

    public List<CheckOutRecord> getAll() {
        return checkOutRecordDao.getAll();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CheckOutRecord findById(Long id) {
        return checkOutRecordDao.findById(id);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteCheckOutRecord(Long id) {
        checkOutRecordDao.deleteCheckOutRecord(id);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void createCheckOutRecord(CheckOutRecord checkOutRecord) {
        checkOutRecordDao.createCheckOutRecord(checkOutRecord);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateCheckOutRecord(CheckOutRecord checkOutRecord) {
        checkOutRecordDao.updateCheckOutRecord(checkOutRecord);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
