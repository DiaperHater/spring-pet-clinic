package com.shlang.springpetclinic.model;

public class Owner extends Person {

    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
