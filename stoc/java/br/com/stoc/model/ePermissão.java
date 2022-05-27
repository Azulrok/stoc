package br.com.stoc.model;

public enum ePermissão {
    FUNCIONARIO("ROLE_FUNCIONARIO"),
    ADMIN("ROLE_ADMIN");
	
	public final String valor;
	ePermissão(String valorOpcao){
		valor = valorOpcao;
	}
	public String getValor() {
		return valor;
	}
}
