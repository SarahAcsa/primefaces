package br.com.ambientinformatica.primefaces.controle;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.ambientinformatica.jpa.exception.PersistenciaException;
import br.com.ambientinformatica.primefaces.entidade.Produto;
import br.com.ambientinformatica.primefaces.persistencia.ProdutoDao;

@Controller("ProdutoControl")
@Scope("conversation")
public class ProdutoControl implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Produto produto = new Produto(); 
	private String nome;
	private String categoria1;
	private String categoria2;
	private String categoria3;
	private String categoria4;
	@Autowired
	private ProdutoDao produtoDao;
	
	private List<Produto> produtos = new ArrayList<Produto>();
	private List<Produto> produtos2;
	
	private EntityManager manager;
	
//	@PostConstruct
//	   public void init(){
//	      listar(null);
//	   }
	
	public ProdutoControl() {
//		listar2();
	}
	
	public void confirmar(ActionEvent evt) {
		try {
			produtoDao.alterar(produto);
			listar(evt);
			produto = new Produto();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void listar(ActionEvent evt) {
		try {
			produtos = produtoDao.listar();
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	
	public void listar2() {
		try {
			System.out.println("Entrou");
			if(nome != null && !nome.trim().equals("")) {
				produtos2 = produtoDao.listarPorNome(nome);
			}
			else{
				produtos2 = produtoDao.listar();
			}
			
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void listar3() {
		try {
			
				produtos2 = produtoDao.listarPorCategoriaEletronico(categoria1);

		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	public void listar4() {
		try {
				produtos2 = produtoDao.listarPorCategoriaEletrodomestico(categoria2);
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	public void listar5() {
		try {
			produtos2 = produtoDao.listarPorCategoriaMovel(categoria3);
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	public void listar6() {
		try {
			produtos2 = produtoDao.listarPorCategoriaOutros(categoria4);
		} catch (Exception e) {
			UtilFaces.addMensagemFaces(e);
		}
	}
	
	

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ProdutoDao getProdutoDao() {
		return produtoDao;
	}

	public void setProdutoDao(ProdutoDao produtoDao) {
		this.produtoDao = produtoDao;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Produto> getProdutos2() {
		if(produtos2 == null) {
			try {
				System.out.println("GET");
				produtos2 = produtoDao.listar();
			} catch (PersistenciaException e) {
				produtos2 = new ArrayList<Produto>();
			}
		}
		return produtos2;
	}

	public void setProdutos2(List<Produto> produtos2) {
		this.produtos2 = produtos2;
	}

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	
	
	
	
	
}
