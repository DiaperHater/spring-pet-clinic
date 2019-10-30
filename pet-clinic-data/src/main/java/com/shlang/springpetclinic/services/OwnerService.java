package com.shlang.springpetclinic.services;

import com.shlang.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    public Owner save(Owner owner);

    public Owner getByLastName(String lastName);

    public Owner getById(Long id);

    public Set<Owner> getAll();

}
