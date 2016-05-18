/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.service;

import edu.mum.cs545.lms.domain.Member;
import java.util.List;

/**
 *
 * @author 984986
 */
public interface MemberService {
    List<Member> getAll();
    void addMember(Member member);
    Member getMemberById(String memberId);
    void updateMember(Member member);
    void deleteMember(Member member);
}
