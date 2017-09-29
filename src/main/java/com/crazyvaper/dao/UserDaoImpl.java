package com.crazyvaper.dao;

import com.crazyvaper.dao.interfaces.UserDao;
import com.crazyvaper.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void save(User emtity) {
        entityManager.persist(emtity);
    }

    @Override
    public User getById(int id) {
        return entityManager.createQuery("SELECT u FROM User u WHERE id=:id", User.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public User getByName(String name) {
        return entityManager.createQuery("SELECT u FROM User u WHERE name=:name", User.class)
                .setParameter("name", name)
                .getSingleResult();
    }

    @Override
    @Transactional
    public void update(User entity) {
        entityManager.merge(entity);
    }

    @Override
    public List<User> getAll() {
        return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
    }

    @Override
    public void delete(User entity) {
        entityManager.remove(entity);
    }

}
