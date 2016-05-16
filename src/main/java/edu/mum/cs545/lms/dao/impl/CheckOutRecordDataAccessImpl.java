/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.dao.impl;

import edu.mum.cs545.lms.dao.CheckOutRecordDataAccess;
import edu.mum.cs545.lms.domain.CheckOutRecord;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mike
 */
@Component
public class CheckOutRecordDataAccessImpl implements CheckOutRecordDataAccess{

    public List<CheckOutRecord> getAll() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CheckOutRecord findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteCheckOutRecord(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void createCheckOutRecord(CheckOutRecord checkOutRecord) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateCheckOutRecord(CheckOutRecord checkOutRecord) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
