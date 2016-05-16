/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.service.impl;

import edu.mum.cs545.lms.dao.PublisherDataAccess;
import edu.mum.cs545.lms.domain.Publisher;
import edu.mum.cs545.lms.service.PublisherService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Mikiyas
 */
public class PublisherServiceImpl implements PublisherService{
    
    PublisherDataAccess publisherDao;
    @Autowired
    public void setPublisherDao(PublisherDataAccess publisherDao) {
        this.publisherDao = publisherDao;
    } 

    public void create(Publisher p) {
        publisherDao.save(p);
    }

    public void update(Publisher p, Long id) {
        publisherDao.save(p);
    }

    public void delete(Long id) {
        publisherDao.delete(id);
    }

    public List<Publisher> findByFirstName(String fname) {
        return publisherDao.findByFirstName(fname);
    }

    public List<Publisher> findByLastName(String lname) {
         return publisherDao.findByLastName(lname);
    }

    public List<Publisher> findById(long id) {
         return publisherDao.findById(id);
    }
    
}
