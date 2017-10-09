package com.crazyvaper.dao.interfaces;

import java.util.Collection;
import java.util.List;

public interface IDAO<T> {
    void save(T emtity);

    T getById(long id);

    void update(T entity);

    List<T> getAll();

    void delete(long id);
}
