package com.warehouse.project.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

@Repository
@Transactional
public class AccountDAO {
    @Autowired
    private EntityManager entityManager;

    public Account findUserAccount(String email) {
        try {
            String sql = "Select e from " + Account.class.getName() + " e " //
                    + " Where e.email = :email ";

            Query query = entityManager.createQuery(sql, Account.class);
            query.setParameter("email", email);

            return (Account) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}
