package com.vinamra.vjpetclinic.services.map;

import com.vinamra.vjpetclinic.model.Pet;
import com.vinamra.vjpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet,Long>
{
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Pet object)
    {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id)
    {
        super.deleteById(id);
    }
}