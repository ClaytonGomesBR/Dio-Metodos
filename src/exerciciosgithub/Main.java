package exerciciosgithub;

public class Main {
	
	public static void main(String[] args) {
		
		// Calculadora 
		
		System.out.println("Exercício Calculadora: ");
		Calculadora.soma(3, 0);
		Calculadora.subtracao(9, 1.0);
		Calculadora.multiplicacao(7, 0);
		Calculadora.divisao(5, 2.5);
		
		// Mensagem
		System.out.println("Exercício Mensagem: ");
		Mensagem.obterMensagem( 9);
		Mensagem.obterMensagem( 14);
		Mensagem.obterMensagem( 19);
		
		// Emprestimo
		System.out.println("Exercício Empréstimo: ");
		Emprestimo.calcular(  1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(  1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(  1000, 5);
		
		
	}
	
	
	

}
