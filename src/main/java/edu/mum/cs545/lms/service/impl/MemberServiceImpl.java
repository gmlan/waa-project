/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.service.impl;

import edu.mum.cs545.lms.dao.MemberDataAccess;
import edu.mum.cs545.lms.domain.Member;
import edu.mum.cs545.lms.service.MemberService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mike
 */
@Service
public class MemberServiceImpl implements MemberService{
    
    @Autowired
    private MemberDataAccess memberDao;

    public List<Member> getAll() {
        return memberDao.getAll();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Member findByMemberId(String memberId) {
        return memberDao.findByMemberId(memberId);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void deleteMember(String memberId) {
        memberDao.deleteMember(memberId);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void createMember(Member member) {
        memberDao.createMember(member);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateMember(Member member) {
        memberDao.updateMember(member);
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
