package pessoaFisicaEJuridica;

public class PessoaJuridica extends Pessoa {

	private String cnpj;
	private Double pagamentoServico;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Double getPagamentoServico() {
		return pagamentoServico;
	}

	public void setPagamentoServico(Double pagamentoServico) {
		this.pagamentoServico = pagamentoServico;
	}

	public String dadosPessoaJuridica() {
		return "Prestador de Serviço: " + getNome() + " CPF: " + getCnpj() + " Comissão: " + getPagamentoServico();
	}

}
