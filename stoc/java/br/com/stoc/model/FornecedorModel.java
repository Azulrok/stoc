package br.com.stoc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "fornecedor",schema = "stoc")
public class FornecedorModel implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_fornecedor")
	private Integer IdFornecedor;
	@Column(name = "numero")
	private Integer Numero;
	@Column(name = "nome_fornecedor")
	private String NomeFornecedor;
	@Column(name = "empresa_fornecedor")
	private String EmpresaFornecedor;
	@Column(name = "email_fornecedor")
	private String EmailFornecedor;
	public Integer getIdFornecedor() {
		return IdFornecedor;
	}
	public void setIdFornecedor(Integer idFornecedor) {
		IdFornecedor = idFornecedor;
	}
	public Integer getNumero() {
		return Numero;
	}
	public void setNumero(Integer numero) {
		Numero = numero;
	}
	public String getNomeFornecedor() {
		return NomeFornecedor;
	}
	public void setNomeFornecedor(String nomeFornecedor) {
		NomeFornecedor = nomeFornecedor;
	}
	public String getEmpresaFornecedor() {
		return EmpresaFornecedor;
	}
	public void setEmpresaFornecedor(String empresaFornecedor) {
		EmpresaFornecedor = empresaFornecedor;
	}
	public String getEmailFornecedor() {
		return EmailFornecedor;
	}
	public void setEmailFornecedor(String emailFornecedor) {
		EmailFornecedor = emailFornecedor;
	}
	
	
	
	
}
	
	
	
	
	
	