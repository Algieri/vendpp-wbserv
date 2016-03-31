package com.vendapp.repositories;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vendapp.model.Pedido;

@RepositoryRestResource(collectionResourceRel = "pedido", path = "pedido", exported = false)
public interface PedidoRepository extends BaseRepository<Pedido, Integer> {

}