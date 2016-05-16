package edu.mum.cs545.lms.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller 
@RequestMapping("/home")
public class HomeController { 
   
    @RequestMapping
   public String homePage(Model model) {   
       System.out.println("edu.mum.cs545.lms.controller.MyController.homePage()");
       return "homePage";
   }
 
    
   @RequestMapping(value = { "/contactus" }, method = RequestMethod.GET)
   public String contactusPage(Model model) {
       System.out.println("edu.mum.cs545.lms.controller.HomeController.contactusPage()");
       model.addAttribute("address", "Vietnam");
       model.addAttribute("phone", "...");
       model.addAttribute("email", "...");
       return "contactusPage";
   }
}