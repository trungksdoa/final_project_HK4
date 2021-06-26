/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.werehouse.project.service.account;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.werehouse.project.model.Account;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class CustomerUserDetailService implements UserDetailsService{
     private EntityManager entityManager;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account;
        String sql ="SELECT a FROM Account a WHERE a.email = :email";
        Query query = entityManager.createQuery(sql,String.class);
        query.setParameter("email",username);
        List<Account> list = new ArrayList<Account>();
        list = query.getResultList();
        if (list.size()>0){
            account = list.get(0);

            List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
            GrantedAuthority authority = new SimpleGrantedAuthority("ADMIN");
            grantedAuthorities.add(authority);

            UserDetails userDetails = new User(username,account.getPassword(),grantedAuthorities);
            return userDetails;
        } else {
            new UsernameNotFoundException("Login Fail");
        }
        return null;
    }
    
}
