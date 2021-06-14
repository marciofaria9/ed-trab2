package br.edu.univas.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.univas.vo.ArvoreGenerica;
import br.edu.univas.vo.No;

public class StartApp {

	public static void main(String[] args) {

		StartApp app = new StartApp();
		app.initialize();

	}

	public void initialize() {

		Scanner scanner = new Scanner(System.in);

		ArvoreGenerica arvore = new ArvoreGenerica();

		No computador = arvore.criarProduto("Computador");

		No gabinete = arvore.criarSubArvore("Gabinete", 300f, 1);
		
		computador.getFilhos().add(gabinete);
		
		No placaMae = arvore.criarSubArvore("Placa Mãe", 400f, 1);
		
		gabinete.getFilhos().add(placaMae);
		
		No SSD = arvore.criarNo("SSD", 380f, 1);

		placaMae.getFilhos().add(SSD);

		No RAM = arvore.criarNo("RAM", 300f, 2);

		placaMae.getFilhos().add(RAM);

	}

}
