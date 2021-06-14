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
		
		//raiz nivel 0

		No computador = arvore.criarProduto("Computador");
		
		
		// nivel 1 filhos do computador

		No monitor = arvore.criarNo("Monitor", 1000f, 1);
		computador.getFilhos().add(monitor);

		No mouse = arvore.criarNo("Mouse", 200f, 1);
		computador.getFilhos().add(mouse);

		No teclado = arvore.criarNo("Teclado", 200f, 1);
		computador.getFilhos().add(teclado);

		No gabinete = arvore.criarSubArvore("Gabinete", 300f, 1);
		computador.getFilhos().add(gabinete);
		
		//nivel 2 filhos do gabinete
		
		
		No fonte = arvore.criarNo("Fonte", 400f, 1);
		gabinete.getFilhos().add(fonte);

		No placaMae = arvore.criarSubArvore("Placa Mãe", 400f, 1);
		gabinete.getFilhos().add(placaMae);

		//nivel 3 filhos da placa mae
		
		
		No SSD = arvore.criarNo("SSD", 400f, 1);
		placaMae.getFilhos().add(SSD);

		No RAM = arvore.criarNo("RAM", 300f, 2);
		placaMae.getFilhos().add(RAM);
		
		No placaDeVideo = arvore.criarNo("Placa de Vídeo", 1500f, 1);
		placaMae.getFilhos().add(SSD);
		
		No processador = arvore.criarSubArvore("Processador", 1000f, 1);
		placaMae.getFilhos().add(processador);
		
		//nivel 4 filho do processador
		
		No waterCooler = arvore.criarNo("Water Cooler", 200f, 1);
		processador.getFilhos().add(waterCooler);

	}

}
