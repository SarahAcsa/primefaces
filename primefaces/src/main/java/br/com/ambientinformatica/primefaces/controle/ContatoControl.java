package br.com.ambientinformatica.primefaces.controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.ambientinformatica.primefaces.entidade.Contato;
import br.com.ambientinformatica.primefaces.persistencia.ContatoDao;

@Controller("ContatoControl")
@Scope("conversation")
public class ContatoControl implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Contato contato = new Contato();
	

	@Autowired
	private ContatoDao contatoDao;

	private List<Contato> contatos = new ArrayList<Contato>();

	public ContatoControl() {
		// TODO Auto-generated constructor stub
	}
	

	public void confirmar(ActionEvent evt) {
		try {
			contatoDao.alterar(contato);
			listar(evt);
			contato = new Contato();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	public void listar(ActionEvent evt) {
		try {
			contatos = contatoDao.listar();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

}
