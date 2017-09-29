package com.crazyvaper.service.interfaces;

import java.util.Collection;

public interface IService<T> {

    void save(T emtity);

    T getById(int id);

    T getByName(String name);

    void update(T entity);

    Collection<T> getAll();

    void delete(int id);

}
