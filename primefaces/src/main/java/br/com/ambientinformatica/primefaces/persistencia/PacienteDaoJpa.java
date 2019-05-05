package br.com.ambientinformatica.primefaces.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.ambientinformatica.primefaces.entidade.Paciente;

@Repository("pacienteDao")
public class PacienteDaoJpa extends PersistenciaJpa<Paciente> implements PacienteDao{

   private static final long serialVersionUID = 1L;

}
