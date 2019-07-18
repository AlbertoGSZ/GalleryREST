package com.quantumstudio.galleryrest.services.impl;
import com.quantumstudio.galleryrest.entities.Technique;
import com.quantumstudio.galleryrest.exceptions.DuplicatedEntityException;
import com.quantumstudio.galleryrest.exceptions.EntityNotFound;
import com.quantumstudio.galleryrest.models.TechniqueModel;
import com.quantumstudio.galleryrest.repositories.TechniqueRepository;
import com.quantumstudio.galleryrest.services.TechniqueServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TechniqueServicesImpl implements TechniqueServices {

	private final TechniqueRepository techniqueRepository;

	public TechniqueServicesImpl(TechniqueRepository techniqueRepository){
		this.techniqueRepository = techniqueRepository;
	}

	@Override
	public Technique save(TechniqueModel techniqueModel) throws DuplicatedEntityException {
		Optional<Technique> techniqueOptional = techniqueRepository.findById(techniqueModel.getId());  //Cambiar a búsqueda por nombre

		if(techniqueOptional.isPresent())                 //isPresent pregunta si no es nulo.
			throw new DuplicatedEntityException();
		Technique technique = new Technique();
		technique.setName(techniqueModel.getName());
		technique.setArtistSet(techniqueModel.getArtistSet());
		technique.setPaintingList(techniqueModel.getPaintingList());
		technique = techniqueRepository.save(technique);

		return techniqueRepository.save(technique);
	}

	@Override
	public TechniqueModel findOne(long id) throws EntityNotFound {
		return techniqueRepository.findById(id).map(TechniqueModel::from).orElseThrow(EntityNotFound::new);    //Revisar orElse, orElseGet, orElseThrow
	}

	@Override
	public Technique save(Technique technique) throws DuplicatedEntityException {
		return null;
	}

	@Override
	public List<TechniqueModel> findAll(){
		return techniqueRepository.findAll().stream().map(TechniqueModel::from).collect(Collectors.toList());
	}
}
