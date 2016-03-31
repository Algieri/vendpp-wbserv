package com.vendapp.repositories;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vendapp.model.rutacliente;

@RepositoryRestResource(collectionResourceRel = "rutacliente", path = "rutacliente", exported = false)
public interface RutaClienteRepository extends BaseRepository<rutacliente, Integer> {

}
