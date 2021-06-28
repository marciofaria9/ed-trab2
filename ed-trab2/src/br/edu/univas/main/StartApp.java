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
		cadastrarArvore(arvore, scanner);

	}

	public void cadastrarArvore(ArvoreGenerica arvore, Scanner scanner) {

		System.out.println("**********CADASTRO DE PRODUTO**********\n");

		System.out.println("Populando o nível 0\n");
		// raiz nivel 0

		No computador = arvore.criarProduto("Computador");

		// nivel 1 filhos do computador
		System.out.println("Populando o nível 1\n");

		No monitor = arvore.criarNo("Monitor", 1000f, 1);
		arvore.addList(computador, monitor);

		No mouse = arvore.criarNo("Mouse", 200f, 1);
		arvore.addList(computador, mouse);

		No teclado = arvore.criarNo("Teclado", 200f, 1);
		arvore.addList(computador, teclado);

		No gabinete = arvore.criarSubArvore("Gabinete", 300f, 1);
		arvore.addList(computador, gabinete);

		// nivel 2 filhos do gabinete
		System.out.println("Populando o nível 2\n");
		No fonte = arvore.criarNo("Fonte", 400f, 1);
		arvore.addList(gabinete, fonte);

		No placaMae = arvore.criarSubArvore("Placa Mãe", 400f, 1);
		arvore.addList(gabinete, placaMae);

		// nivel 3 filhos da placa mae
		System.out.println("Populando o nível 3\n");
		No SSD = arvore.criarNo("SSD", 400f, 2);
		arvore.addList(placaMae, SSD);

		No RAM = arvore.criarNo("RAM", 300f, 2);
		arvore.addList(placaMae, RAM);

		No placaDeVideo = arvore.criarNo("Placa de Vídeo", 1500f, 1);
		arvore.addList(placaMae, placaDeVideo);

		No processador = arvore.criarSubArvore("Processador", 1000f, 1);
		arvore.addList(placaMae, processador);

		// nivel 4 filho do processador
		System.out.println("Populando o nível 4\n");
		No waterCooler = arvore.criarNo("Water Cooler", 200f, 1);
		arvore.addList(processador, waterCooler);

		calculaPreco(computador, gabinete, placaMae, processador);
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

	public void calculaPreco(No computador, No gabinete, No placaMae, No processador) {

		processador.setValorTotal(processador.calculavalor(processador));
		System.out.println("Valor total do processador: R$:" + processador.getValorTotal());
		float v1 = processador.getValorTotal();

		placaMae.setValorTotal(placaMae.calculavalor(placaMae));
		System.out.println("Valor total da Placa Mãe: R$:" + placaMae.getValorTotal());
		float v2 = placaMae.getValorTotal();

		gabinete.setValorTotal(gabinete.calculavalor(gabinete));
		System.out.println("Valor total do gabinete: R$:" + gabinete.getValorTotal());
		float v3 = gabinete.getValorTotal();

		computador.setValorTotal(computador.calculavalor(computador));
		System.out.println("Valor total do computador: R$:" + computador.getValorTotal());
		float v4 = computador.getValorTotal();

		System.out.println("\nValor Final: R$:" + (v1 + v2 + v3 + v4));

	}

}
