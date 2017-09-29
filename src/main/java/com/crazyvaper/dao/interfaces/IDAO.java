package com.crazyvaper.dao.interfaces;

import java.util.List;

public interface IDAO<T> {
    void save(T emtity);

    T getUserById(int id);

    T getUserByName(String name);

    T update(T entity);

    List<T> getAll();

    void delete(int id);

    void delete(String name);
}
