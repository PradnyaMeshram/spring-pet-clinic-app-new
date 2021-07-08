package com.springframework.sfgpetclinicnew.services;

import com.springframework.sfgpetclinicnew.model.Owner;

import java.util.Set;

public interface OwnerServices extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
