package com.quantumstudio.galleryrest.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.quantumstudio.galleryrest.entities.Artist;
import com.quantumstudio.galleryrest.entities.Painting;
import com.quantumstudio.galleryrest.entities.Technique;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.security.acl.Group;
import java.util.List;
import java.util.Set;

public class TechniqueModel {

	private Long id;
	@NotNull
	private String name;
	private Set<Artist> artistSet;
	private List<Painting> paintingList;


	public static TechniqueModel from(Technique technique) {
		TechniqueModel techniqueModel = new TechniqueModel();
		techniqueModel.setArtistSet(technique.getArtistSet());
		techniqueModel.setId(technique.getId());
		techniqueModel.setName(technique.getName());
		techniqueModel.setPaintingList(technique.getPaintingList());
		return techniqueModel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Artist> getArtistSet() {
		return artistSet;
	}

	public void setArtistSet(Set<Artist> artistSet) {
		this.artistSet = artistSet;
	}

	public List<Painting> getPaintingList() {
		return paintingList;
	}

	public void setPaintingList(List<Painting> paintingList) {
		this.paintingList = paintingList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
