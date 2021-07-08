package com.springframework.sfgpetclinicnew.services.map;

import com.springframework.sfgpetclinicnew.model.Owner;
import com.springframework.sfgpetclinicnew.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends  AbstractMapServices<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

}
