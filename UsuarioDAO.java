package br.com.leandrocorp.projeto.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.leandrocorp.projeto.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{

	
	public Usuario findByEmailAndSenha(String email, String senha);
	public Usuario findByRacfAndSenha(String racf, String senha);
	//public Usuario findByRacfAndSenha(String racf, String senha);
}
