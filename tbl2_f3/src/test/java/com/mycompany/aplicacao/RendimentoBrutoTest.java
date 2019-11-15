package com.mycompany.aplicacao;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class RendimentoBrutoTest {
	@ParameterizedTest
	@CsvSource({"60, 1000.00F, 8.5F, 13.97F", "120, 500, 8, 13.15F", "1000, 100.00F, 7.5F, 20.55F", "420, 250.0F, 8.0F, 23.01F"})
	public void test(int dias, float aplicacaoInicial, float juros, float resultado) {
		Aplicacao aplicacao = new Aplicacao(dias, aplicacaoInicial, juros);
		assertEquals(resultado, aplicacao.getRendimentoBruto(), 0.01F);
	}
}