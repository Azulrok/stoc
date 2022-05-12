package br.com.stoc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stoc.model.UsuarioModel;



public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{

}