package com.quantumstudio.galleryrest.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Entity
public class Technique {

    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @Column(unique = true)
    private String name;

    @ManyToMany(mappedBy = "techniqueSet")
    private Set<Artist> artistSet;

    @OneToMany
    private List<Painting> paintingList;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
