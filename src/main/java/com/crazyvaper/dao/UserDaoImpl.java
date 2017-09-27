package com.crazyvaper.dao;

import com.crazyvaper.entity.Role;
import com.crazyvaper.entity.User;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public void save(User user) {
//        if (user.getLogin() == null){
//            user.setLogin(false);
//        }
//        if (user.getRole() == null){
//            user.setRole(Role.USER);
//        }
        entityManager.persist(user);
    }

    @Override
    public User getUserById(int id) {
        return entityManager.createQuery("SELECT u FROM User u WHERE id=:id", User.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public User getUserByName(String name) {
        return entityManager.createQuery("SELECT u FROM User u WHERE name=:name", User.class)
                .setParameter("name", name)
                .getSingleResult();
    }

    @Override
    @Transactional
    public User update(User newUser) {
        return entityManager.merge(newUser);
    }

    @Override
    public List<User> getAll() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    @Transactional
    public void delete(int id) {
        entityManager.remove(getUserById(id));
    }

    @Override
    @Transactional
    public void delete(String name) {
        entityManager.remove(getUserByName(name));
    }
}
