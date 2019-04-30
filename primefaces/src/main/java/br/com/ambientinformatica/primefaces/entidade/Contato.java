package br.com.ambientinformatica.primefaces.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Contato {

   @Id
   @GeneratedValue(generator="contato_seq", strategy=GenerationType.SEQUENCE)
   @SequenceGenerator(name="contato_seq", sequenceName="contato_seq", allocationSize=1, initialValue=1)
   private Integer id;
   
   private String nome;
   private String cpf; 
   private String telefone;
   private String nasc;
   private String tipoPerfil;
   private String email;
   private String endereco;
   
   
   public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getNasc() {
	return nasc;
}

public void setNasc(String nasc) {
	this.nasc = nasc;
}

public String getTipoPerfil() {
	return tipoPerfil;
}

public void setTipoPerfil(String tipoPerfil) {
	this.tipoPerfil = tipoPerfil;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}



   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getTelefone() {
      return telefone;
   }

   public void setTelefone(String telefone) {
      this.telefone = telefone;
   }

   public Integer getId() {
      return id;
   }
   
   public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}  

}
