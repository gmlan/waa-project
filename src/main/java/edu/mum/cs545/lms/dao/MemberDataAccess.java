/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.dao;

import edu.mum.cs545.lms.domain.Member;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mike
 */
//@Component
public interface MemberDataAccess {
     //List<Member> getAll();
    List<Member> getAll();
    Member findByMemberId(String memberId);
    void deleteMember(String memberId);
    void createMember(Member member);
    void updateMember(Member member);
}
