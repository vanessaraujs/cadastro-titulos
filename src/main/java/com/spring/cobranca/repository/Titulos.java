package com.spring.cobranca.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.cobranca.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long> {
	
	 
}
