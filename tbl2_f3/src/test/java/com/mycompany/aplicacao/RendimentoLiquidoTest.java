package com.mycompany.aplicacao;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RendimentoLiquidoTest {
	@ParameterizedTest
	@CsvSource({ "60, 1000.00F, 8.5F, 1.0829F", "120, 500, 8, 2.0384F", "1000, 100.00F, 7.5F, 17.4658F", "420, 250.0F, 8.0F, 7.5945F" })
	public void test(int dias, float aplicacaoInicial, float juros, float resultado) {
		Aplicacao aplicacao = new Aplicacao(dias, aplicacaoInicial, juros);
		assertEquals(resultado, aplicacao.getRendimentoLiquido(), 0.01F);
	}
}