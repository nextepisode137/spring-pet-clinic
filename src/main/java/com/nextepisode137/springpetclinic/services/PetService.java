package com.nextepisode137.springpetclinic.services;

import com.nextepisode137.springpetclinic.model.Owner;
import com.nextepisode137.springpetclinic.model.Pet;

import java.util.Set;

interface PetService {
    Pet findById(Long id);
    Owner save(Pet save);
    Set<Pet> findAll();
}
