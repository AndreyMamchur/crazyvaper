package com.crazyvaper.dao.interfaces;

import java.util.Collection;
import java.util.List;

public interface IDAO<T> {
    void save(T emtity);

    T getById(int id);

    T getByName(String name);

    void update(T entity);

    Collection<T> getAll();

    void delete(T entity);
}
