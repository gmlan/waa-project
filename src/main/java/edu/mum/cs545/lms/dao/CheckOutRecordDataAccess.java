/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.dao;

import edu.mum.cs545.lms.domain.CheckOutRecord;
import java.util.List;
/**
 *
 * @author Mike
 */
//@Component
public interface CheckOutRecordDataAccess {
    List<CheckOutRecord> getAll();
    CheckOutRecord findById(Long id);
    void deleteCheckOutRecord(CheckOutRecord checkOutRecord);
    void createCheckOutRecord(CheckOutRecord checkOutRecord);
    void updateCheckOutRecord(CheckOutRecord checkOutRecord);
}
