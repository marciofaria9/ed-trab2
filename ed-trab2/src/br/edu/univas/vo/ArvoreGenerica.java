package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArvoreGenerica {
	Scanner scanner = new Scanner(System.in);
	No produto;

	public No getProduto() {
		return produto;
	}

	public void setProduto(No produto) {
		this.produto = produto;
	}

	public No criarProduto(String nome) {
		float startValor = 0f;
		final int quantProduto = 1;

		produto = criarSubArvore(nome, startValor, quantProduto);

		return produto;

	}

	public No criarSubArvore(String nome, Float valorUni, int quantidade) {

		No pai = criarNo(nome, valorUni, quantidade);

		return pai;

	}

	public No criarNo(String nome, Float valorUni, int quantidade) {

		No no = new No();

		no.setNome(nome);

		no.setValorUni(valorUni);

		no.setQuantidade(quantidade);

		return no;

	}

	public void addList(No pe?a, No no) {

		pe?a.getFilhos().add(no);

	}

	public void imprimeNosFolha(No no) {
		
		if (isFolha(no)) {
			System.out.print(no.getNome()+", ");
		}
		for (int i = 0; i < no.getFilhos().size(); i++) {
			imprimeNosFolha(no.getFilhos().get(i));
		}
	}

	public boolean isFolha(No no) {
		if (no.getFilhos().size() == 0) {
			return true;
		}

		return false;
	}
}
