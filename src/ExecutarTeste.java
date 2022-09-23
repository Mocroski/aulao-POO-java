import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Modulo Orientaçao objeto");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Modulo Spring");
		produto2.setValor(BigDecimal.valueOf(150));
		
		
		Venda venda = new Venda();
		venda.setDescricao("Venda curso java");
		venda.setEnderecoEntrega("Entrefa pelo email");
		venda.setId(123L);
		venda.setNomeClieente("Lucas Mocroski");
		venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		venda.getListaProdutos().add(produto1);//posso fazer validacoes na lista
		venda.getListaProdutos().add(produto2);//nao posso fazer validacoes antes de adicionar na lista
		
		for (Produto produto : venda.getListaProdutos()) {
			System.out.println("Descricaao produto" + produto);
		}
		
		System.out.println("Descrição da venda: " + venda);
	}
}
