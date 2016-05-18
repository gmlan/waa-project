package edu.mum.cs545.lms.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "t_checkout")
public class CheckOutRecord implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    @NotBlank(message = "ISBN can not be blank")
    private String ISBN;
    @NotBlank(message = "Member Id can not be blank")
    private String memberId;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="MM/dd/yyyy")
    @NotNull(message = "Due date can not be blank")
    private Date dueDate;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern="MM/dd/yyyy")
    @NotNull(message = "Checkout date can not be blank")
    private Date dateCheckout;

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

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDateCheckout() {
        return dateCheckout;
    }

    public void setDateCheckout(Date dateCheckout) {
        this.dateCheckout = dateCheckout;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

   
}
