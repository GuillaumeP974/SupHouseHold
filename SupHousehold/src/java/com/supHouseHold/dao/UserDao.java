/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.supHouseHold.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author Romain
 */
@Stateless
public class UserDao {
    
    
    @PersistenceContext
    private EntityManager em;
    
    public User addUser(User user){
        em.persist(user);
        return user;
    }

public User findUser(String username, String password){
        
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<User> query = criteriaBuilder.createQuery(User.class);
        
        Root<User> user = query.from(User.class);
        
        List<Predicate> predicates = new ArrayList<>(5);
        
        if (username != null){
            
            predicates.add(criteriaBuilder.equal(user.get("username"), username));
        }
        
        if (password != null){
            
            predicates.add(criteriaBuilder.equal(user.get("password"), password));
        }

        query.select(user).where(predicates.toArray(new Predicate[predicates.size()]));

        TypedQuery<User> userQuery = em.createQuery(query);
        
        User result = null;
        
        try{
            result = userQuery.getSingleResult();
        }catch (NoResultException e){
            
        }
        
        return result;
    }
}
