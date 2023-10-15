// Classe que implementa a interface ICarro
//aqui definimos o que ocorre em cada método que foi herdado da interface Carro

public class CarroSedan implements ICarro {

	public void montarChassi() {
		System.out.println("Montando o chassi do carro sedan");
	}

	public void instalarMotor() {
		System.out.println("Instalando o motor no carro sedan");
	}

	public void instalarRodas() {
		System.out.println("Instalando as rodas no carro sedan");
	}

	public void aplicarPintura() {
		System.out.println("Aplicando a pintura no carro sedan");
	}
}
