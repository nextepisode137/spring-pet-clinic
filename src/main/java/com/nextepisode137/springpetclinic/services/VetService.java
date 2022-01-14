package com.nextepisode137.springpetclinic.services;

import com.nextepisode137.springpetclinic.model.Owner;
import com.nextepisode137.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet findByLastName(String lastName);
    Vet save(Vet save);
    Set<Vet> findAll();
}
