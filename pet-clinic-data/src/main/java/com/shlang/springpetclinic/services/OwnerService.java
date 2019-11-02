package com.shlang.springpetclinic.services;

import com.shlang.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    public Owner getByLastName(String lastName);

}
