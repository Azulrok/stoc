package br.com.stoc.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;



@Entity
@Table(name = "permissao",schema = "sakila")
public class PermissaoModel implements Serializable,GrantedAuthority{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_permissao")
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<UsuarioModel> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuarioModel> usuarios) {
		this.usuarios = usuarios;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@ManyToMany(mappedBy = "permissoes")
	private List <UsuarioModel> usuarios;

	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return this.nome;
	}
}
