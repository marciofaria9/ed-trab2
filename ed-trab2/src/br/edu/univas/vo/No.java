package br.edu.univas.vo;

import java.util.ArrayList;
import java.util.List;

public class No {

	String nome;

	Float valorUni;

	int quantidade;

	List<No> filhos;

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

	public List<No> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<No> filhos) {
		this.filhos = filhos;
	}

}
