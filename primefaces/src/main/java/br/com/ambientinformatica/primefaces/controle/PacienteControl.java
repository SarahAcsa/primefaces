package br.com.ambientinformatica.primefaces.controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.ambientinformatica.primefaces.entidade.Paciente;
import br.com.ambientinformatica.primefaces.persistencia.PacienteDao;

@Controller("PacienteControl")
@Scope("conversation")
public class PacienteControl implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Paciente paciente = new Paciente();
	

	@Autowired
	private PacienteDao pacienteDao;

	private List<Paciente> pacientes = new ArrayList<Paciente>();

	public PacienteControl() {
		// TODO Auto-generated constructor stub
	}
	

	public void confirmar(ActionEvent evt) {
		try {
			pacienteDao.alterar(paciente);
			listar(evt);
			paciente = new Paciente();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	public void listar(ActionEvent evt) {
		try {
			pacientes = pacienteDao.listar();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public List<Paciente> getPacientes() {
		return pacientes;
	}

}
