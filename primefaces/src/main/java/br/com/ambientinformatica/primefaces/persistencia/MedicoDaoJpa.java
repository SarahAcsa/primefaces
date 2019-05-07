package br.com.ambientinformatica.primefaces.persistencia;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.ambientinformatica.primefaces.entidade.Medico;

@Repository("medicoDao")

public class MedicoDaoJpa extends PersistenciaJpa<Medico> implements MedicoDao {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	@Override
	public List<Medico> listarPorNome(String nome) {
		List<Medico> lista;

		
		Query consultaNome = getEntityManager().createQuery(String.format("SELECT p FROM Medico p WHERE p.nome LIKE '%%%s%%'", nome));
		lista = consultaNome.getResultList();
		return lista;
	}

	@Override
	public List<Medico> listarPorCategoriaEletronico(String categoria1) {
		List<Medico> lista2;

		
		Query consultacat = getEntityManager().createQuery(String.format("SELECT p FROM Medico p WHERE p.categoria LIKE 'Eletronico'", categoria1));
		lista2 = consultacat.getResultList();
		return lista2;
	}

	@Override
	public List<Medico> listarPorCategoriaEletrodomestico(String categoria2) {
		List<Medico> lista2;

		
		Query consultacat = getEntityManager().createQuery(String.format("SELECT p FROM Medico p WHERE p.categoria LIKE 'Eletrodoméstico'", categoria2));
		lista2 = consultacat.getResultList();
		return lista2;
	}

	@Override
	public List<Medico> listarPorCategoriaMovel(String categoria3) {
		List<Medico> lista2;

		
		Query consultacat = getEntityManager().createQuery(String.format("SELECT p FROM Medico p WHERE p.categoria LIKE 'Movél'", categoria3));
		lista2 = consultacat.getResultList();
		return lista2;
	}

	@Override
	public List<Medico> listarPorCategoriaOutros(String categoria4) {
		List<Medico> lista2;

		
		Query consultacat = getEntityManager().createQuery(String.format("SELECT p FROM Medico p WHERE p.categoria LIKE 'Outros'", categoria4));
		lista2 = consultacat.getResultList();
		return lista2;
	}

	
	
	
}
