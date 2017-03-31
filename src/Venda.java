import javax.swing.JOptionPane;

public class Venda {
	private Produto produto;
	private Vendedor vendedor;
	public double desconto;
	private int quantidadeItens;
	public double valor;
	
	
	public void efetuarDesconto(double desc){
		desc *= this.produto.getValorVenda();//VARIAVEL DESC AGORA GUARDA O DESCONTO EM REAIS
		double valoraposdesconto = this.produto.getValorVenda() - desc;
		
		if(valoraposdesconto < this.produto.getValorCusto()){
			JOptionPane.showMessageDialog(null, "O valor do produto '"+this.produto.getDescricao()+"' apos o desconto n�o pode ficar abaixo do valor de custo dele! ;)");
			this.desconto = -1;
		}
		else{
			this.desconto = desc;//AGORA SUBSTITUI SE O DESCONTO FOR VALIDO, O VALOR DE PORCENTAGEM PARA REAL
		}
	}
	
	public void calcularValor(){
		this.valor = this.getQuantidadeItens() * ((this.produto.getValorVenda()-this.desconto));//D� O VALOR DA TRANSA��O
	}
	public double calcularComissao(double comissao){
		if(this.produto.promocao == true){
			comissao =  this.vendedor.getComissao() / 2;//TIRA O VALOR DA COMISS�O EM REAIS
			comissao *= this.valor;
		}
		else{
			comissao = this.vendedor.getComissao()*valor;
			
		}
		this.vendedor.setComissao(comissao);//SETA NA VARIAVEL DA CLASSE VENDEDOR O VALOR EM REAIS DA COMISS�O DO POBRE VENDEDOR TRABALHADOR BRASILEIRO
		return comissao;//RETORNA A COMISS�O PRA IMPRESS�O, PODERIA FAZER AQUI MAS...
	}

	public void imprimir(){
		String menu = "Codigo do vendedor: "+this.vendedor.getCodigo()+"\n"+
				"Nome do vendedor: "+ this.vendedor.getNome()+"\n"+
				"Comissao: "+this.vendedor.getComissao()+"\n"+
				"Quantidade de itens vendidos: "+this.getQuantidadeItens()+"\n"+
				"O codigo do produto: "+this.produto.getCodigo()+"\n"+
				"Descri��o do mesmo: "+this.produto.getDescricao()+"\n"+
				"Valor de venda do produto: "+this.produto.getValorVenda()+"\n"+
				"Promo��o do produto? "+this.produto.promocao+"\n"+
				"Valor de desconto: "+this.desconto+"\n"+
				"Valor total da venda: "+this.valor;
		JOptionPane.showMessageDialog(null, menu);
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}
	
	
	
}
