package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

public class ArvoreGenerica {



	public No criarProduto(String nome) {
		float startValor = 0f;
		final int quantProduto = 1;

		No produto = criarNo(nome, startValor, quantProduto);

		return produto;

	}

	public No criarSubArvore(String nome, Float valorUni, int quantidade) {

		No pai = criarNo(nome, valorUni, quantidade);

		return pai;

	}

	public No criarNo(String nome, Float valorUni, int quantidade) {

		No no = new No();

		no.nome = nome;

		no.valorUni = valorUni;

		no.quantidade = quantidade;

		return no;

	}

}
