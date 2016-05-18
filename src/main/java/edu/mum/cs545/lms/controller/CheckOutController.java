/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.controller;

import edu.mum.cs545.lms.domain.Book;
import edu.mum.cs545.lms.domain.CheckOutRecord;
import edu.mum.cs545.lms.domain.Member;
import edu.mum.cs545.lms.domain.User;
import edu.mum.cs545.lms.service.CheckOutRecordService;
import edu.mum.cs545.lms.service.MemberService;
import edu.mum.cs545.lms.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Mike
 */
@Controller
public class CheckOutController {
    
     @Autowired
    MemberService memberService;
    
    @Autowired
    CheckOutRecordService checkOutRecordService;
    
    @RequestMapping(value = "/checkout", method = RequestMethod.GET)
    public String checkout(Model model){
        //model.addAttribute("userlist",userService.getAll());
        Member member1 = new Member();
        member1.setMemberId("1122");
        member1.setFirstName("Michael");
        
        Member member2 = new Member();
        member2.setMemberId("3344");
        member2.setFirstName("Biniam");
        
        List<Member> memberList = new ArrayList<Member>();
        memberList.add(member1);
        memberList.add(member2);
        
        
        Book book1 = new Book();
        book1.setIsbn("1111111");
        book1.setTitle("Spring MVC");
        
        Book book2 = new Book();
        book2.setIsbn("222222");
        book2.setTitle("JSF");
        
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(book1);
        bookList.add(book2);
        
        model.addAttribute("memberList",memberList);
        
        model.addAttribute("bookList",bookList);
        
        CheckOutRecord newCheckOut = new CheckOutRecord();
        
        model.addAttribute("newCheckOut", newCheckOut);
        
        return "checkout";
    }
    
    @RequestMapping(value = "/listCheckout", method = RequestMethod.GET)
    public String listCheckout(Model model){
        model.addAttribute("checkoutList", checkOutRecordService.getAll());
        return "listCheckout";
    }
    
    @RequestMapping(value = "/checkout", method = RequestMethod.POST)
    public String addNewCheckout(@ModelAttribute("newCheckOut") CheckOutRecord newCheckOut, RedirectAttributes redirectAttributes){
        //redirectAttributes.addAttribute("tagline","checkout saved");
        checkOutRecordService.createCheckOutRecord(newCheckOut);
        return "redirect:/listCheckout";
    }
    
    
    @RequestMapping(value = "/checkout/edit/{id}", method = RequestMethod.GET)
    public String updateCheckout(Model model, @PathVariable Long id){
        CheckOutRecord checkout = checkOutRecordService.findById(id);
        model.addAttribute("newCheckOut",checkout);
        
        return "checkout";
    }
    
    @RequestMapping(value = "/checkout/edit/{id}", method = RequestMethod.POST)
    public String saveUpdateCheckout(@ModelAttribute("newCheckOut") CheckOutRecord checkout, @PathVariable Long id, RedirectAttributes redirectAttributes){
        checkOutRecordService.updateCheckOutRecord(checkout);
        redirectAttributes.addFlashAttribute("message", "Checkout updated successfully");
        return "redirect:/listCheckout";
    }
    
    @RequestMapping(value = "/checkout/delete/{id}", method = RequestMethod.GET)
    public String deleteCheckout(@PathVariable Long id, RedirectAttributes redirectAttributes){
        CheckOutRecord checkout = checkOutRecordService.findById(id);
        checkOutRecordService.deleteCheckOutRecord(checkout);
        redirectAttributes.addFlashAttribute("message", "Checkout deleted successfully");
        
        return "redirect:/listCheckout";
    }
}
