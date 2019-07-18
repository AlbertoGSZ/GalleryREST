package com.quantumstudio.galleryrest.repositories;
import com.quantumstudio.galleryrest.entities.Technique;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechniqueRepository extends JpaRepository<Technique,Long> {

}
