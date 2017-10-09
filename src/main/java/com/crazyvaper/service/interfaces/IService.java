package com.crazyvaper.service.interfaces;

import java.util.Collection;
import java.util.List;

public interface IService<T> {

    void save(T emtity);

    T getById(long id);

    void update(T entity);

    List<T> getAll();

    void delete(long id);

}
