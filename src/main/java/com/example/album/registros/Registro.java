package com.example.album.registros;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "registros")
@Entity(name = "registros")
public class Registro {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	private String title;
	
	private String image;
	
	private String descricao;
	
	public Registro() {
		
	}
	
	//Nao declara get pois esta a extensão é record
	public Registro(RegistroDTORequest data) {
		this.title = data.title();
		this.image = data.image();
		this.descricao = data.descricao();
	}
	
	public Registro(Long id, String title, String image, String descricao) {
		this.id = id;
		this.title = title;
		this.image = image;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registro other = (Registro) obj;
		return Objects.equals(id, other.id);
	}
	
}
