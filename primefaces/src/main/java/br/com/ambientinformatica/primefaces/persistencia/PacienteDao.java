package br.com.ambientinformatica.primefaces.persistencia;

import java.util.List;

import br.com.ambientinformatica.jpa.persistencia.Persistencia;
import br.com.ambientinformatica.primefaces.entidade.Paciente;
import br.com.ambientinformatica.primefaces.entidade.Medico;

public interface PacienteDao extends Persistencia<Paciente>{

	List<Paciente> listarPorNome(String nome);
}
