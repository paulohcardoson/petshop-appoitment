package me.paulohcardoson.petshop_appointments.service;

import me.paulohcardoson.petshop_appointments.model.Pet;
import me.paulohcardoson.petshop_appointments.repository.PetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    // Use Lombok to create a constructor for PetRepository
    private final PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    // List all pets
    public List<Pet> listAllPets() {
        return petRepository.findAll();
    }


}
