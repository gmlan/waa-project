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
 * @author Mike
 */
public interface MemberService {
    List<Member> getAll();
    Member findByMemberId(String memberId);
    void deleteMember(String memberId);
    void createMember(Member member);
    void updateMember(Member member);
}
