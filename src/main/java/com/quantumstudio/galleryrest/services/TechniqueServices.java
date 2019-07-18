package com.quantumstudio.galleryrest.services;

import com.quantumstudio.galleryrest.entities.Technique;
import com.quantumstudio.galleryrest.exceptions.DuplicatedEntityException;
import com.quantumstudio.galleryrest.exceptions.EntityNotFound;
import com.quantumstudio.galleryrest.models.TechniqueModel;

import java.util.List;

public interface TechniqueServices {

	Technique save(Technique technique) throws DuplicatedEntityException;

	List<TechniqueModel> findAll();

	Technique save(TechniqueModel techniqueModel) throws DuplicatedEntityException;

	TechniqueModel findOne(long id) throws EntityNotFound;
}
