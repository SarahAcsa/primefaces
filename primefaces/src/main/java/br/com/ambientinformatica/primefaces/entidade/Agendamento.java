package br.com.ambientinformatica.primefaces.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Agendamento {

	@Id
	   @GeneratedValue(generator="agendamento_seq", strategy=GenerationType.SEQUENCE)
	   @SequenceGenerator(name="agendamento_seq", sequenceName="agendamento_seq", allocationSize=1, initialValue=1)
	   private Integer id;
	   
	@Temporal(TemporalType.TIME)
	   private Date hora;
	   
	
	@Temporal(TemporalType.DATE)
	   private Date data; 
	
	private String nome;
	private String especialidade;

	
	
	
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
