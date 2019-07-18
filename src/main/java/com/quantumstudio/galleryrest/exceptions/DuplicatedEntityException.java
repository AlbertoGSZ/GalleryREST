package com.quantumstudio.galleryrest.exceptions;

public class DuplicatedEntityException extends Exception {

	public DuplicatedEntityException() {
		super("La entidad ya existe.");
	}
}
