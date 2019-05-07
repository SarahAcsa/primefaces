package br.com.ambientinformatica.primefaces.persistencia;

import java.util.List;

import br.com.ambientinformatica.jpa.persistencia.Persistencia;
import br.com.ambientinformatica.primefaces.entidade.Medico;

public interface MedicoDao extends Persistencia<Medico>{

	List<Medico> listarPorNome(String nome);
	List<Medico> listarPorCategoriaEletronico(String categoria1);
	List<Medico> listarPorCategoriaEletrodomestico(String categoria2);
	List<Medico> listarPorCategoriaMovel(String categoria3);
	List<Medico> listarPorCategoriaOutros(String categoria4);
}