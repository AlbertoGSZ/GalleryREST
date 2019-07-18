package com.quantumstudio.galleryrest.controllers;
import com.quantumstudio.galleryrest.entities.Technique;
import com.quantumstudio.galleryrest.exceptions.DuplicatedEntityException;
import com.quantumstudio.galleryrest.models.TechniqueModel;
import com.quantumstudio.galleryrest.services.TechniqueServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TechniqueController {

	private final TechniqueServices techniqueServices;

	public TechniqueController (TechniqueServices techniqueServices) {
		this.techniqueServices=techniqueServices;
	}

	@PostMapping("/techniques")
	public Technique save(@RequestBody Technique technique) throws DuplicatedEntityException {
		return techniqueServices.save(technique);
	}

	@GetMapping("/Techniques")
	public List<TechniqueModel> findAll(){
		return techniqueServices.findAll();
	}

	@GetMapping("/Techniques/{id}")
	public List<TechniqueModel> findOne(@PathVariable long id){
		return null;
	}

}
