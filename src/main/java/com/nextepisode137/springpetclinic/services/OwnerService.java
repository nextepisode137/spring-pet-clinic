package com.nextepisode137.springpetclinic.services;

import com.nextepisode137.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Owner findByLastName(String lastName);
    Owner save(Owner save);
    Set<Owner> findAll();
}
