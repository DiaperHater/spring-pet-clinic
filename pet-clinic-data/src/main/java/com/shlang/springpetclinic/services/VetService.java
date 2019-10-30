package com.shlang.springpetclinic.services;

import com.shlang.springpetclinic.model.Owner;
import com.shlang.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    public Vet save(Vet vet);

    public Vet getById(Long id);

    public Set<Vet> getAll();

}
