package projeto_mercado;

public class Produtos {
	private int codProdutos;
	private String nomeProduto;
	private double precoProduto;
	private int estoque;
	private String descricaoProduto;
	
	public Produtos(int codProdutos, String nomeProduto, double precoProduto, String descricaoProduto) {
		super();
		this.codProdutos = codProdutos;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.descricaoProduto = descricaoProduto;
		this.estoque = 0;
	}
	
	public void adiconarEstoque(int quantidade) {
		this.estoque += quantidade;
		
	}
	
	public void venderProduto(int quantidadeVendida) {
		 this.estoque -= quantidadeVendida;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public int getCodProdutos() {
		return codProdutos;
	}

	public double getPrecoProduto() {
		return precoProduto;
	}

	@Override
	public String toString() {
		return "______________________________________________________________________________________________________________________________________________________________________" + 
			   "|podutos" + codProdutos + " | nomeProduto " + nomeProduto + " | precoProduto " + precoProduto+ " | estoque " + estoque + " | descricaoProduto " + descricaoProduto + "|";
	}
	
	
	
	
}
