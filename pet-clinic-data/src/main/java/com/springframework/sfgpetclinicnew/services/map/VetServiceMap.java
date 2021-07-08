package com.springframework.sfgpetclinicnew.services.map;

import com.springframework.sfgpetclinicnew.model.Vet;
import com.springframework.sfgpetclinicnew.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapServices<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
         super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {
        return super.save(vet.getId(), vet);
    }
}
