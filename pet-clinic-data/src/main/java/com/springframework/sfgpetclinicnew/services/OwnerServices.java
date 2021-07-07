package com.springframework.sfgpetclinicnew.services;

import com.springframework.sfgpetclinicnew.model.Owner;

import java.util.Set;

public interface OwnerServices {

    Owner findByLatName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
