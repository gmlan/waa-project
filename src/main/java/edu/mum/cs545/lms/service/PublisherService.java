/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.service;

import edu.mum.cs545.lms.domain.Publisher;
import java.util.List;

/**
 *
 * @author Biwota
 */
public interface PublisherService {
    
    public void create(Publisher p);
    public void update(Publisher p, Long id);
    public void delete(Long id);
    List<Publisher> findByFirstName(String fname);
    List<Publisher> findByLastName(String lname);
    List<Publisher> findById(long id);
    
}
