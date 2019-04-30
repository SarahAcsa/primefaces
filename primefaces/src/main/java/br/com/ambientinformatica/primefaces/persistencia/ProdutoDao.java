package br.com.ambientinformatica.primefaces.persistencia;

import java.util.List;

import br.com.ambientinformatica.jpa.persistencia.Persistencia;
import br.com.ambientinformatica.primefaces.entidade.Produto;

public interface ProdutoDao extends Persistencia<Produto>{

	List<Produto> listarPorNome(String nome);
	List<Produto> listarPorCategoriaEletronico(String categoria1);
	List<Produto> listarPorCategoriaEletrodomestico(String categoria2);
	List<Produto> listarPorCategoriaMovel(String categoria3);
	List<Produto> listarPorCategoriaOutros(String categoria4);
}