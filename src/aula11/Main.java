package aula11;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.setCor("Amarelo");
		carro.setHorarioEntrada("19:40");
		carro.setModelo("Camaro");
		carro.setPlaca("ABC1234");
		carro.setQtdPortas(2);
		//ficou estacionado por 3 horas
		carro.calcularPreco(3);
		
		Moto moto = new Moto();
		
		moto.setCor("Vinho");
		moto.setHorarioEntrada("20:00");
		moto.setModelo("1200cc");
		moto.setPlaca("ZXC9874");
		//ficou estacionado por 3 horas
		moto.calcularPreco(3);
		
		
	}

}
