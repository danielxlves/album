package com.example.album.registros;

public record RegistroDTOReponse(Long id, String title, String image, String descricao){
	
	public RegistroDTOReponse(Registro registro) {
		// Atribuir os valores do objeto Registro aos campos correspondentes do RegistroDTOResponse
		this(registro.getId(), registro.getTitle(), registro.getImage(), registro.getDescricao());
	}

}
