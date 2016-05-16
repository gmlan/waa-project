/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.cs545.lms.dao;

import edu.mum.cs545.lms.domain.Member;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mike
 */
public interface MemberDataAccess {
     List<Member> getAll();
}
