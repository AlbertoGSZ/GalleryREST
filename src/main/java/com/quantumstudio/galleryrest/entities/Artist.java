package com.quantumstudio.galleryrest.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
public class Artist {

    @Id
    @GeneratedValue
    private long id;

    @Size(min = 3)
    @NotNull
    private String name;

    @OneToMany
    private Set<Painting> paintingSet;

    @ManyToMany
    private Set<Client> clientSet;

    @ManyToMany
    private Set<Technique> techniqueSet;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Painting> getPaintingSet() {
        return paintingSet;
    }

    public void setPaintingSet(Set<Painting> paintingSet) {
        this.paintingSet = paintingSet;
    }

    public Set<Client> getClientSet() {
        return clientSet;
    }

    public void setClientSet(Set<Client> clientSet) {
        this.clientSet = clientSet;
    }

    public Set<Technique> getTechniqueSet() {
        return techniqueSet;
    }

    public void setTechniqueSet(Set<Technique> techniqueSet) {
        this.techniqueSet = techniqueSet;
    }
}
