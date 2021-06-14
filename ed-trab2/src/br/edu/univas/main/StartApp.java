package br.edu.univas.main;

import java.util.ArrayList;
import java.util.List;

import br.edu.univas.vo.ArvoreGenerica;
import br.edu.univas.vo.No;

public class StartApp {

	public static void main(String[] args) {

		StartApp app = new StartApp();
		app.initialize();

	}

	public void initialize() {

		ArvoreGenerica arvore = new ArvoreGenerica();
		cadastrarArvore(arvore);

		
	}

	public void cadastrarArvore(ArvoreGenerica arvore) {

		// raiz nivel 0

		No computador = arvore.criarProduto("Computador");

		// nivel 1 filhos do computador

		No monitor = arvore.criarNo("Monitor", 1000f, 1);
		computador.filhos.add(monitor);

		No mouse = arvore.criarNo("Mouse", 200f, 1);
		computador.filhos.add(mouse);

		No teclado = arvore.criarNo("Teclado", 200f, 1);
		computador.filhos.add(teclado);

		No gabinete = arvore.criarSubArvore("Gabinete", 300f, 1);
		computador.filhos.add(gabinete);

		// nivel 2 filhos do gabinete

		No fonte = arvore.criarNo("Fonte", 400f, 1);
		gabinete.filhos.add(fonte);

		No placaMae = arvore.criarSubArvore("Placa Mãe", 400f, 1);
		gabinete.filhos.add(placaMae);

		// nivel 3 filhos da placa mae

		No SSD = arvore.criarNo("SSD", 400f, 1);
		placaMae.filhos.add(SSD);

		No RAM = arvore.criarNo("RAM", 300f, 2);
		placaMae.filhos.add(RAM);

		No placaDeVideo = arvore.criarNo("Placa de Vídeo", 1500f, 1);
		placaMae.filhos.add(SSD);

		No processador = arvore.criarSubArvore("Processador", 1000f, 1);
		placaMae.filhos.add(processador);

		// nivel 4 filho do processador

		No waterCooler = arvore.criarNo("Water Cooler", 200f, 1);
		processador.filhos.add(waterCooler);

		System.out.println(processador.getNome() + " preço: " + processador.getValorUni() + " quantidade: " + processador.getQuantidade());
		
	}
	
}
