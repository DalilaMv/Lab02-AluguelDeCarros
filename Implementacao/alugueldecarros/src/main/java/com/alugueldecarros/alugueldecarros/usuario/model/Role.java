package com.alugueldecarros.alugueldecarros.usuario.model;

import java.util.ArrayList;
import java.util.List;

public enum Role {
	
	ADMIN("ADMIN"),
	CLIENTE("CLIENTE");
	
	private String nome;

	private Role(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		return getNome();
	}

	public static List<String> getRoles() {
		List<String> roles = new ArrayList<String>(); 
		
		for (Role role : values()) {
			roles.add(role.getNome());
		}
		
		return roles;
	}
}
