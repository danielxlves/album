package com.example.album.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.album.registros.Registro;
import com.example.album.registros.RegistroDTOReponse;
import com.example.album.registros.RegistroDTORequest;
import com.example.album.registros.RegistroRepository;

@RestController
@RequestMapping("album")
public class AlbumController {
	
	@Autowired
	private RegistroRepository repository;
	
	@PostMapping
	public void salvarRegistro(@RequestBody RegistroDTORequest data){
		// Converter RegistroDTORequest em Registro
		Registro registrodata = new Registro(data);
		// Salvar o registro no repositório
		repository.save(registrodata);
		// Retorna void (vazio)
		return;
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping
	public List<RegistroDTOReponse> getAll() {
		// Buscar todos os registros do repositório
		List<RegistroDTOReponse> registroLista = repository.findAll().stream().map(RegistroDTOReponse::new).toList();
		// Retornar a lista de registros
		return registroLista;
	}
}
