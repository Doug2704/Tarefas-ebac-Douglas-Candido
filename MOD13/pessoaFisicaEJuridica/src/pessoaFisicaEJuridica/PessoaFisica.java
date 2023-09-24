package pessoaFisicaEJuridica;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private Double salario;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String dadosPessoaFisica() {
		return "Funcionário: " + getNome() + " CPF: " + getCpf() + " Salário: " + getSalario();
	}

}
