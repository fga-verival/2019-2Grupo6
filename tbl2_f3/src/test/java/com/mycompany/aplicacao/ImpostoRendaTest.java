package com.mycompany.aplicacao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImpostoRendaTest {
	@Test
	void test() {
		Aplicacao aplicacao = new Aplicacao(60, 1000.00F, 8.5F);
		// System.out.println(aplicacao.getImpostoRenda());
		assertEquals(3.14F, aplicacao.getImpostoRenda(), 0.01F);
	}

	@Test
	void anotherTest() {
		Aplicacao aplicacao = new Aplicacao(120, 500.00F, 8.0F);

		assertEquals(2.96F, aplicacao.getImpostoRenda(), 0.01F);
	}

}