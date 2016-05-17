/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.dao;

import edu.mum.cs545.lms.domain.Publisher;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Mikiyas
 */
public interface PublisherDataAccess /*extends JpaRepository<Publisher,Long>*/{
//    List<Publisher> findByFirstName(String fname);
//    List<Publisher> findByLastName(String lname);
//    List<Publisher> findById(long id);
    void addPublisher(Publisher publisher);
}
