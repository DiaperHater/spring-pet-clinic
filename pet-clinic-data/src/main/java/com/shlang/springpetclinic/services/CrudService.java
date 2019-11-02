package com.shlang.springpetclinic.services;

import java.util.Set;


public interface CrudService<T, ID> {

    Set<T> getAll();

    T getById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
