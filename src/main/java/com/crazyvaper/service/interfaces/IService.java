package com.crazyvaper.service.interfaces;

import java.util.List;

public interface IService<T> {

    void save(T entity);

    T getById(int id);

    T getByName(String name);

    T update(T entity);

    List<T> getAll();

    void delete(int id);

    void delete(String name);
}
