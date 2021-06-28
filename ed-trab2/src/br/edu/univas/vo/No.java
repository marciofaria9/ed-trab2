package br.edu.univas.vo;

import java.util.ArrayList;

public class No {

	private String nome;

	private Float valorUni;

	private int quantidade;

	private ArrayList<No> filhos = new ArrayList();
	
	private float valorTotal;

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

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

	public float calculavalor(No no) {

		
		float valor = 0;
		for ( int i = 0 ; i < no.getFilhos().size(); i++ ) {
			
			valor += no.getFilhos().get(i).getValorUni() * no.getFilhos().get(i).getQuantidade();
			
			
		}
		float valorTotal = valor + (no.getValorUni() * no.getQuantidade());
		return valorTotal;
		
		
	}

}
