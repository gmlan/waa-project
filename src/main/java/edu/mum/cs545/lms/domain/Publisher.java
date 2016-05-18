/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Mikiyas
 */
@Entity
public class Publisher {
    
    //@JsonIgnore
    @Id @GeneratedValue
    private long id;


    //@NotBlank(message = "Name can not be blank.")
    //@Field
    private String name;

    //@Email(message = "Invalid Email")
    //@NotBlank(message = "Email can not be blank.")
    private String email;


    //@NotBlank(message = "Phone can not be blank.")
    private  String phone;

    //@JsonIgnore
    //@OneToMany(mappedBy="publisher", cascade=CascadeType.ALL)
    //private List<Book> books = new ArrayList<Book>();

    public long getId() {
            return this.id;
    }

    public void setId(long id) {
            this.id = id;
    }

    public String getEmail() {
            return email;
    }

    public String getPhone() {
            return phone;
    }

    public void setEmail(String email) {
            this.email = email;
    }

    public void setPhone(String phone) {
            this.phone = phone;
    }



    public String getName() {
            return name;
    }

    public void setName(String name) {
            this.name = name;
    }

//    public List<Book> getBooks() {
//            return books;
//    }
//
//    public void setBooks(List<Book> books) {
//            this.books = books;
//    }

    @Override
    public String toString(){
            return this.name;
    }
	
    
}
