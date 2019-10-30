package com.shlang.springpetclinic.services;

import com.shlang.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    public Pet save(Pet pet);

    public Pet getById(Long id);

    public Set<Pet> getAll();

}
