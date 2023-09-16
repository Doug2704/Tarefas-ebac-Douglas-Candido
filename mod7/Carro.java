/*
 * @author Douglas Candido
 */

/*exercicio do modulo 7. 
Essa classe representa um carro com seus atributos e métodos "getters and setters" para esses atributos.
Pode ser usada em um gerenciamento de carros por exemplo.
Caso fosse utilizada para outros propósitos, poderia conter métodos como "andar(), frear(), ligarFarios(), etc*/

public class Carro {
	
	private String modelo;
	private String fabricante;
	private String cor;
	private String combustivel;
	private int ano;

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
