package com.mycompany.aplicacao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RendimentoLiquidoTest {

	@Test
	void test() {
		Aplicacao aplicacao = new Aplicacao(60, 1000.00F, 8.5F);

		assertEquals(1.0829F, aplicacao.getRendimentoLiquido());
	}

	@Test
	void anotherTest() {
		Aplicacao aplicacao = new Aplicacao(120, 500.00F, 8.0F);

		assertEquals(2.034F, aplicacao.getRendimentoLiquido());
	}
}