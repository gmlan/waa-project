package edu.mum.cs545.lms.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
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
    private String memberId;
    //@Temporal(TemporalType.DATE)
    private String dueDate;
   // @Temporal(TemporalType.DATE)
    private String dateCheckout;
//    @ManyToOne(cascade = CascadeType.ALL)
//    private Member member;
   // @ManyToOne(cascade = CascadeType.ALL)
    //private transient Book book;

    public CheckOutRecord() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

//    public Member getMember() {
//        return member;
//    }
//
//    public void setMember(Member member) {
//        this.member = member;
//    }
   
//    public Book getBook() {
//        return book;
//    }
//
//    public void setBook(Book book) {
//        this.book = book;
//    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDateCheckout() {
        return dateCheckout;
    }

    public void setDateCheckout(String dateCheckout) {
        this.dateCheckout = dateCheckout;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

   
}
