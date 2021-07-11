package com.aAbadi.Repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.aAbadi.Model.Personaje;

public interface IPersonajeRepository extends PagingAndSortingRepository<Personaje, Long> {

}
