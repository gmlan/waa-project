/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.controller;

import edu.mum.cs545.lms.domain.CheckOutRecord;
import edu.mum.cs545.lms.domain.User;
import edu.mum.cs545.lms.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    UserService userService;
    
    @RequestMapping("/checkout")
    public String checkout(Model model){
        //model.addAttribute("userlist",userService.getAll());
        User user1 = new User();
        user1.setUserId("1122");
        user1.setFirstName("Michael");
        
        User user2 = new User();
        user2.setUserId("3344");
        user2.setFirstName("Biniam");
        
        List<User> userlist = new ArrayList<User>();
        userlist.add(user1);
        userlist.add(user2);
        
        model.addAttribute("userlist",userlist);
        return "checkout";
    }
    
    @RequestMapping(value = "/checkout", method = RequestMethod.POST)
    public String addNewCheckout(CheckOutRecord checkOutRecord, RedirectAttributes redirectAttributes, Model model){
        redirectAttributes.addAttribute("tagline","checkout saved");
        return "redirect:/listCheckout";
    }
}
