package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import main.Pessoa;

public class ProgramTest {

	@Test
	public void testEquals() {
		List<Pessoa> pessoas = new ArrayList<>();

		String[] s = { "Maria,Feminino", "Pedro,Masculino", "Augusto,Masculino", "Joana,Feminino", "Carol,Feminino",
				"Paul,Masculino", };

		for (String pessoa : s) {
			String[] partes = pessoa.split(",");
			if (partes.length >= 2) { // programação defensiva: testar se realmente tem 2 campos
				String nome = partes[0];
				String sexo = partes[1];
				pessoas.add(new Pessoa(nome, sexo));
			}
		}
		List<Pessoa> mulheres = pessoas.stream().filter(pessoa -> pessoa.getSexo().equals("Feminino"))
				.collect(Collectors.toList());

		for (Pessoa mulher : mulheres) {

			assertEquals("Feminino", mulher.getSexo());

		}
	}
}
