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
	
	
	
	
public void addList (No peça, No no) {
		
		peça.getFilhos().add(no);
		
	}

	

	
	public int readInt(Scanner scanner) {
		int x = scanner.nextInt();
		scanner.nextLine();
		return x;

	}

	public float readFloat(Scanner scanner) {
		float x = scanner.nextFloat();
		scanner.nextLine();
		return x;

	}
}
