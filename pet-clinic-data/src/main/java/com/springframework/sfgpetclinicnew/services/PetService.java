package com.springframework.sfgpetclinicnew.services;

import com.springframework.sfgpetclinicnew.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
