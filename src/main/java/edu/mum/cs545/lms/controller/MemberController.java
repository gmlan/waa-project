/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.controller;

import edu.mum.cs545.lms.domain.Member;
import edu.mum.cs545.lms.service.MemberService;
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
 * @author 984986
 */
@Controller
public class MemberController {
    
    @Autowired
    MemberService memberService;
    
    @RequestMapping(value = "/addMember", method = RequestMethod.GET)
    public String addMemeberForm(Model model){
        Member newMember = new Member();
        model.addAttribute("newMember", newMember);
        return "addMember";
    }
    
    @RequestMapping(value = "/listMember", method = RequestMethod.GET)
    public String listMembers(Model model){
        model.addAttribute("memberList", memberService.getAll());
        return "listMember";
    }
    
    @RequestMapping(value = "/addMember", method = RequestMethod.POST)
    public String addMemeberForm(@ModelAttribute("newMember") @Valid Member newMember, BindingResult result){
         if (result.hasErrors()) {
             return "addMember";
         }
        memberService.addMember(newMember);
        return "redirect:/listMember";
    }
    
    @RequestMapping(value = "/member/edit/{id}", method = RequestMethod.GET)
    public String updateMember(Model model, @PathVariable String id){
        Member member = memberService.getMemberById(id);
        model.addAttribute("newMember",member);
        
        return "addMember";
    }
    
    @RequestMapping(value = "/member/edit/{id}", method = RequestMethod.POST)
    public String saveUpdateMember(@ModelAttribute("newMember") @Valid Member member, BindingResult result, 
            @PathVariable String id, RedirectAttributes redirectAttributes){
        
        if (result.hasErrors()) {
             return "addMember";
         }
        
        memberService.updateMember(member);
        redirectAttributes.addFlashAttribute("message", "member updated successfully");
        return "redirect:/listMember";
    }
    
    @RequestMapping(value = "/member/delete/{id}", method = RequestMethod.GET)
    public String deleteMember(@PathVariable String id, RedirectAttributes redirectAttributes){
        Member member = memberService.getMemberById(id);
        memberService.deleteMember(member);
        redirectAttributes.addFlashAttribute("message", "member deleted successfully");
        
        return "redirect:/listMember";
    }
}
