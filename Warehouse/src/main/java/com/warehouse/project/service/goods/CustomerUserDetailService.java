/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.goods;

import com.warehouse.project.model.Account;
import com.warehouse.project.model.AccountDAO;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


import org.springframework.beans.factory.annotation.Autowired;
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
    EntityManager entityManager;
    @Autowired
    private AccountDAO accountDAO;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = this.accountDAO.findUserAccount(username);
        if (account !=null){
            List<String> roleNames = new ArrayList<>();
            roleNames.add(account.getRole());

            List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
            if (roleNames != null) {
                for (String role : roleNames) {
                    // ROLE_USER, ROLE_ADMIN,..
                    GrantedAuthority authority = new SimpleGrantedAuthority(role);
                    grantList.add(authority);
                }
            }
          /*List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
            GrantedAuthority authority = new SimpleGrantedAuthority("ADMIN");
            grantedAuthorities.add(authority);*/

            UserDetails userDetails = new User(account.getEmail(),account.getPassword(),grantList);
            return userDetails;
        } else {
            return null;
        }
    }
}