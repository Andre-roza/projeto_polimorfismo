package aula11;

public class Moto extends Veiculo {
	@Override
	public void calcularPreco(int qtdHoras) {
		int calc = qtdHoras * 10;
		System.out.println("O valor a pagar é: R$" + calc);

	}

}
