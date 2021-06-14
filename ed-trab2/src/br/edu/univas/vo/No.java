package br.edu.univas.vo;

import java.util.ArrayList;

public class No {

	public String nome;

	public Float valorUni;

	public int quantidade;

	public ArrayList<No> filhos = new ArrayList();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getValorUni() {
		return valorUni;
	}

	public void setValorUni(Float valorUni) {
		this.valorUni = valorUni;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public ArrayList<No> getFilhos() {
		return filhos;
	}

	public void setFilhos(ArrayList<No> filhos) {
		this.filhos = filhos;
	}

}
