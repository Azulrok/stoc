package br.com.stoc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



	@Entity
	@Table(name = "item",schema = "stoc")
	public class ItemModel implements Serializable{

		private static final long serialVersionUID = 1L;
		@Id
		@Column(name = "id_item")
		private Long IdItem;
		@Column(name = "quantidade")
		private Integer Quantidade;
		@Column(name = "cod_descricao")
		private String CodDescricao;
		@Column(name = "localizar_item")
		private String LocalizarItem;
		@Column(name = "nome_item")
		private String Nome_Item;
		public Long getIdItem() {
			return IdItem;
		}
		public void setIdItem(Long idItem) {
			IdItem = idItem;
		}
		public Integer getQuantidade() {
			return Quantidade;
		}
		public void setQuantidade(Integer quantidade) {
			Quantidade = quantidade;
		}
		public String getNome_Item() {
			return Nome_Item;
		}
		public void setNome_Item(String nome_Item) {
			Nome_Item = nome_Item;
		}
		public String getCod_Descricao() {
			return CodDescricao;
		}
		public void setCod_Descricao(String cod_Descricao) {
			CodDescricao = cod_Descricao;
		}
		public String getLocalizar_Item() {
			return LocalizarItem;
		}
		public void setLocalizar_Item(String localizar_Item) {
			LocalizarItem = localizar_Item;
		}
	
	
	
}
