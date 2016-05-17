package edu.mum.cs545.lms.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_checkout")
public class CheckOutRecord implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String ISBN;
    private String userId;
    //@Temporal(TemporalType.DATE)
    private LocalDate dueDate;
    //@Temporal(TemporalType.DATE)
    private LocalDate dateCheckout;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
    @ManyToOne(cascade = CascadeType.ALL)
    private Book book;

    public CheckOutRecord() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getDateCheckout() {
        return dateCheckout;
    }

    public void setDateCheckout(LocalDate dateCheckout) {
        this.dateCheckout = dateCheckout;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
