package br.com.ambientinformatica.primefaces.controle;

import java.io.Serializable;

import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.ambientinformatica.primefaces.entidade.Paciente;
import br.com.ambientinformatica.primefaces.entidade.Usuario;
import br.com.ambientinformatica.primefaces.persistencia.UsuarioDao;

@Controller("UsuarioControl")
@Scope("conversation")
public class UsuarioControl implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Usuario usuario = new Usuario();
	
	private String nome;
	private String senha;
	
	@Autowired
	private UsuarioDao usuarioDao;

	private EntityManager manager;
	
	public UsuarioControl() {
		// TODO Auto-generated constructor stub
	}
	
	public void confirmar(ActionEvent evt) {
		try {
			usuarioDao.alterar(usuario);
			
			usuario = new Usuario();
			//usuarioDao.clear();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	
	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
