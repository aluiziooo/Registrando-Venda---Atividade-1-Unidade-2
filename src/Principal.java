import javax.swing.JOptionPane;

public class Principal {
	public static void main(String []args){
		double comissao1 = 0;
		double comissao2 = 0;
		double comissao3 = 0;
		Produto arroz = new Produto(02,"branco",6.00,3.00,false);
		Vendedor vendedor1 = new Vendedor("Fugi da oca",06,"Japão, ilha de okinawa, provincia xxxxx, casa numero 33333");
		
		Venda novavenda1 = new Venda();
		
		novavenda1.setProduto(arroz);
		novavenda1.setVendedor(vendedor1);
		
		novavenda1.setQuantidadeItens(2);
		novavenda1.efetuarDesconto(0.1);
		if(novavenda1.desconto != -1){
			novavenda1.calcularValor();
			
			comissao1 = novavenda1.calcularComissao(comissao1);
			
			JOptionPane.showMessageDialog(null, "O Valor da comissao é: "+comissao1);
			
			novavenda1.imprimir();
		}
		
		//------------------------------------------------------------------------------------
		Produto pneu = new Produto(03,"preto, blackpiano",100,80,true);
		Vendedor vendedor2 = new Vendedor("japones",04,"Japão, ilha de okinawa, provincia xxxxx, casa numero 33333(primo de fugi da oca)");
		
		Venda novavenda2 = new Venda();
		
		novavenda2.setProduto(pneu);
		novavenda2.setVendedor(vendedor2);
		
		novavenda2.setQuantidadeItens(3);
		novavenda2.efetuarDesconto(0.1);
		if(novavenda2.desconto != -1){
			novavenda2.calcularValor();
			
			comissao2 = novavenda2.calcularComissao(comissao2);
			
			JOptionPane.showMessageDialog(null, "O Valor da comissao é: "+comissao2);
			
			novavenda2.imprimir();
		}
		
		//---------------------------------------------------------------------------------------
		Venda novavenda3 = new Venda();
		novavenda3.setProduto(pneu);
		novavenda3.setVendedor(vendedor2);
		
		novavenda3.setQuantidadeItens(2);
		novavenda3.efetuarDesconto(0.3);
		if(novavenda3.desconto !=-1){
			novavenda3.calcularValor();
			
			comissao3 = novavenda3.calcularComissao(comissao3);
			
			JOptionPane.showMessageDialog(null, "O Valor da comissao é: "+comissao3);
			
			novavenda3.imprimir();
			
		}
		
		
	}
}
