package projeto_mercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	static List<Produtos> produtos = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {	
		int opcao;
		do {
			System.out.println("Bem-vindo ao mercado da esquina");
			System.out.println("opções: ");
			System.out.println("1- adicionar novo produto");
			System.out.println("2- remover produto");
			System.out.println("3- adicionar estoque");
			System.out.println("4- vender produto");
			System.out.println("5- Pesquisar produto");
			System.out.println("6- listar produtos");
			System.out.println("0- encerrar progama ");
			
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1: {
				adicionarProduto();
				break;
			}
			case 2: {
				removerProduto();
				break;
			}
			case 3: {
				adicionarEstoque();
				break;
			}
			case 4: {
				venderProduto();
				break;
			}case 5: {
				System.out.println("Digite o codigo do produto");
				int codProduto = sc.nextInt();
				Produtos produtoEncontrado = pesquisarProduto(codProduto);
				produtoEncontrado.toString();
				break;
			}
			case 6: {
				produtos.toString();
				break;
			}
			
			default:
				System.out.println("Digite uma opção válida");
				break;
			}
			
		}while(true);
		
		
	}
	
	public static void adicionarProduto() {
		System.out.print("Digite o codigo do produto que será adicionado: ");
		int codProduto = sc.nextInt();
		System.out.print("Digite o nome do produto que será adicionado: ");
		String nomeProduto = sc.next();
		System.out.print("Digite o preço do produto que será adicionado: ");
		double precoProduto = sc.nextDouble();
		System.out.print("Digite a descrição do produto que será adicionado: ");
		String descProduto = sc.next();
		
		produtos.add(new Produtos(codProduto, nomeProduto, precoProduto, descProduto));
		System.out.println("Produto adicionado!!");
		return;
		
	}
	
	public static void removerProduto() {
		System.out.print("Digite o codigo do produto que será removido: ");
		int codProduto = sc.nextInt();
		Produtos produtoEncontrado = pesquisarProduto(codProduto);
		
		if(produtoEncontrado != null) {
			produtos.remove(produtoEncontrado.getCodProdutos());
			System.out.println("Produto removido!");
			return;
		}
		else {
			System.out.println("Produto não encontrado!");
			return;
		}
	}
	
	public static void venderProduto() {
		System.out.print("Digite o codigo do produto que será vendido: ");
		int codProduto = sc.nextInt();
		Produtos produtoEncontrado = pesquisarProduto(codProduto);
		
		if(produtoEncontrado != null) {
			System.out.print("Digite a quantidade que será vendida: ");
			int quantidadeVendida = sc.nextInt();
			
			produtoEncontrado.venderProduto(quantidadeVendida);
			System.out.println("Venda concluida!");
			return;
		}
		else {
			System.out.println("Produto não encontrado!");
			return;
		}
		
		
	}
	
	public static void adicionarEstoque() {
		System.out.print("Digite o codigo do produto que será abastecido: ");
		int codProduto = sc.nextInt();
		Produtos produtoEncontrado = pesquisarProduto(codProduto);
		
		if(produtoEncontrado != null) {
			System.out.print("Digite quanto será adicionado ao estoque: ");
			int quantidadeAdicionar = sc.nextInt();
		
			produtoEncontrado.adiconarEstoque(quantidadeAdicionar);
			System.out.println("Estoque inserido!!");
			
			return;
		}
		else {
			System.out.println("Produto não encontrado!");
			return;
		}
		
		
	}
	
	public static Produtos pesquisarProduto(int codigo){
		
		for(Produtos produto : produtos) {
			if(produto.getCodProdutos() == codigo) {
				return produto;
			}
		}
		return null;
		
	}
}
