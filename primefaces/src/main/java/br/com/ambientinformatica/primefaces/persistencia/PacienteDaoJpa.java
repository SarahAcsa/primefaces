package br.com.ambientinformatica.primefaces.persistencia;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.ambientinformatica.primefaces.entidade.Paciente;

@Repository("pacienteDao")
public class PacienteDaoJpa extends PersistenciaJpa<Paciente> implements PacienteDao {

	private static final long serialVersionUID = 1L;

	@Override
	public List<Paciente> listarPorNome(String nome) {
		List<Paciente> lista;

		Query consultaNome = getEntityManager()
				.createQuery(String.format("SELECT p FROM paciente p WHERE p.nome LIKE '%s%'", nome));
		lista = consultaNome.getResultList();
		return lista;

	}
}
