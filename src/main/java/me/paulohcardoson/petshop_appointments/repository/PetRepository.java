package me.paulohcardoson.petshop_appointments.repository;

import me.paulohcardoson.petshop_appointments.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
