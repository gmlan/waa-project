/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.service.impl;

import edu.mum.cs545.lms.dao.AuthorDataAccess;
import edu.mum.cs545.lms.domain.Author;
import edu.mum.cs545.lms.service.AuthorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Biwota
 */
@Service
public class AuthorServiceImpl implements AuthorService{

    AuthorDataAccess authorDao;
    @Autowired
    public void setAuthorDao(AuthorDataAccess authorDao) {
        this.authorDao = authorDao;
    }
    
    public void addAuthor(Author a){
        authorDao.addAuthor(a);
    }
    public List<Author> getAll(){
        return authorDao.getAll();
    }
    public Author getAuthorById(String id){
        return authorDao.getAuthorById(id);
    }
    
//    public void create(Author author) {
//        authorDao.save(author);
//    }
//
//    
//
//    public void update(Author author, Long id) {
//        authorDao.save(author);
//    }
//
//    public void delete(Long id) {
//        authorDao.delete(id);
//    }
//
//    public List<Author> findByFirstName(String fname) {
//        return authorDao.findByFirstName(fname);
//    }
//
//    public List<Author> findByLastName(String lname) {
//        return authorDao.findByFirstName(lname);
//    }
//
//    public List<Author> findById(long id) {
//        return authorDao.findById(id);
//    }
    
}
