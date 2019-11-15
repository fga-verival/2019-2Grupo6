package com.mycompany.aplicacao;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ImpostoRendaTest {
	@ParameterizedTest
	@CsvSource({"60, 1000.00F, 8.5F, 3.14F", "120, 500, 8, 2.96F", "1000,100.00F, 7.5F, 3.08F","420, 250.0F, 8.0F, 4.03F"})
	public void test(int dias, float aplicacaoInicial, float juros, float resultado) {
		Aplicacao aplicacao = new Aplicacao(dias, aplicacaoInicial, juros);
		assertEquals(resultado, aplicacao.getImpostoRenda(), 0.01F);
	}
}