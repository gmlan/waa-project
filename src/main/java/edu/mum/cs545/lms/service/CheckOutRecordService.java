/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.service;

import edu.mum.cs545.lms.domain.CheckOutRecord;
import java.util.List;

/**
 *
 * @author Mike
 */
public interface CheckOutRecordService {
    List<CheckOutRecord> getAll();
    CheckOutRecord findById(Long id);
    void deleteCheckOutRecord(Long id);
    void createCheckOutRecord(CheckOutRecord checkOutRecord);
    void updateCheckOutRecord(CheckOutRecord checkOutRecord);
}
