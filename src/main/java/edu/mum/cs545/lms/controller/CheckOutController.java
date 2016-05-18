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
import edu.mum.cs545.lms.service.BookService;
import edu.mum.cs545.lms.service.CheckOutRecordService;
import edu.mum.cs545.lms.service.MemberService;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    
    @Autowired
    BookService bookService;
    
    @RequestMapping(value = "/checkout", method = RequestMethod.GET)
    public String checkout(Model model){
               
        model.addAttribute("memberList",memberService.getAll());
        
        model.addAttribute("bookList",bookService.availableBooks());
        
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
    public String addNewCheckout(@ModelAttribute("newCheckOut") @Valid CheckOutRecord newCheckOut, 
            BindingResult result, RedirectAttributes redirectAttributes, Model model){
        
        if (result.hasErrors()) {
            model.addAttribute("memberList",memberService.getAll());
            model.addAttribute("bookList",bookService.availableBooks());
            return "checkout";
        }
//        System.out.println("new isbn...." + newCheckOut.getISBN());
        checkOutRecordService.createCheckOutRecord(newCheckOut);
        return "redirect:/listCheckout";
    }
    
    
    @RequestMapping(value = "/checkout/edit/{id}", method = RequestMethod.GET)
    public String updateCheckout(Model model, @PathVariable Long id){
        CheckOutRecord checkout = checkOutRecordService.findById(id);
        model.addAttribute("newCheckOut",checkout);
        model.addAttribute("memberList",memberService.getAll());
        model.addAttribute("bookList",bookService.availableBooks());
        return "checkout";
    }
    
    @RequestMapping(value = "/checkout/edit/{id}", method = RequestMethod.POST)
    public String saveUpdateCheckout(@ModelAttribute("newCheckOut") @Valid CheckOutRecord checkout, BindingResult result, 
            @PathVariable Long id, RedirectAttributes redirectAttributes, Model model){
        
        if (result.hasErrors()) {
            model.addAttribute("memberList",memberService.getAll());
            model.addAttribute("bookList",bookService.availableBooks());
            return "checkout";
        }
        
        checkOutRecordService.updateCheckOutRecord(checkout);
        redirectAttributes.addFlashAttribute("message", "Checkout updated successfully");
        return "redirect:/listCheckout";
    }
    
    @RequestMapping(value = "/checkout/delete/{id}", method = RequestMethod.GET)
    public String deleteCheckout(@PathVariable Long id, RedirectAttributes redirectAttributes){
        CheckOutRecord checkout = checkOutRecordService.findById(id);
        checkOutRecordService.deleteCheckOutRecord(checkout);
        redirectAttributes.addFlashAttribute("message", "Check in success");
        
        return "redirect:/listCheckout";
    }
}
