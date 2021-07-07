package com.springframework.sfgpetclinicnew.services;

import com.springframework.sfgpetclinicnew.model.Pet;
import com.springframework.sfgpetclinicnew.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
