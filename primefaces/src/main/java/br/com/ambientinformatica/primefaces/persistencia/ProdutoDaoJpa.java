package br.com.ambientinformatica.primefaces.persistencia;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.ambientinformatica.primefaces.entidade.Produto;

@Repository("produtoDao")

public class ProdutoDaoJpa extends PersistenciaJpa<Produto> implements ProdutoDao {

	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	@Override
	public List<Produto> listarPorNome(String nome) {
		List<Produto> lista;

		
		Query consultaNome = getEntityManager().createQuery(String.format("SELECT p FROM Produto p WHERE p.nome LIKE '%%%s%%'", nome));
		lista = consultaNome.getResultList();
		return lista;
	}

	@Override
	public List<Produto> listarPorCategoriaEletronico(String categoria1) {
		List<Produto> lista2;

		
		Query consultacat = getEntityManager().createQuery(String.format("SELECT p FROM Produto p WHERE p.categoria LIKE 'Eletronico'", categoria1));
		lista2 = consultacat.getResultList();
		return lista2;
	}

	@Override
	public List<Produto> listarPorCategoriaEletrodomestico(String categoria2) {
		List<Produto> lista2;

		
		Query consultacat = getEntityManager().createQuery(String.format("SELECT p FROM Produto p WHERE p.categoria LIKE 'Eletrodoméstico'", categoria2));
		lista2 = consultacat.getResultList();
		return lista2;
	}

	@Override
	public List<Produto> listarPorCategoriaMovel(String categoria3) {
		List<Produto> lista2;

		
		Query consultacat = getEntityManager().createQuery(String.format("SELECT p FROM Produto p WHERE p.categoria LIKE 'Movél'", categoria3));
		lista2 = consultacat.getResultList();
		return lista2;
	}

	@Override
	public List<Produto> listarPorCategoriaOutros(String categoria4) {
		List<Produto> lista2;

		
		Query consultacat = getEntityManager().createQuery(String.format("SELECT p FROM Produto p WHERE p.categoria LIKE 'Outros'", categoria4));
		lista2 = consultacat.getResultList();
		return lista2;
	}

	
	
	
}
