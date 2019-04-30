package br.com.ambientinformatica.primefaces.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Produto {

	   @Id
	   @GeneratedValue(generator="produto_seq", strategy=GenerationType.SEQUENCE)
	   @SequenceGenerator(name="produto_seq", sequenceName="produto_seq", allocationSize=1, initialValue=1)
	   private Integer id;
	
	private String nome;
	private String categoria;
	private String estado;
	private String formadescarte;
	private String descricao;
	 
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFormadescarte() {
		return formadescarte;
	}
	public void setFormadescarte(String formadescarte) {
		this.formadescarte = formadescarte;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Integer getId() {
	      return id;
	   }

	
}
