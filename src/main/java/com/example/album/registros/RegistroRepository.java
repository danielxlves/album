package com.example.album.registros; // Pacote que contém a classe

import org.springframework.data.jpa.repository.JpaRepository; // Importação da interface JpaRepository do Spring Data JPA

public interface RegistroRepository extends JpaRepository<Registro, Long> {
	// Interface RegistroRepository que estende JpaRepository
	
}
