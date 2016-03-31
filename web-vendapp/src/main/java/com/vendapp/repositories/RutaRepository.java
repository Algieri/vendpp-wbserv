package com.vendapp.repositories;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vendapp.model.Ruta;

@RepositoryRestResource(collectionResourceRel = "ruta", path = "ruta", exported = false)
public interface RutaRepository extends BaseRepository<Ruta, Integer> {

}