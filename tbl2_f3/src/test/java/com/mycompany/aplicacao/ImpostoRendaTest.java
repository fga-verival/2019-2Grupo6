package com.mycompany.aplicacao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImpostoRendaTest {
	@Test
	void test() {
		Aplicacao aplicacao = new Aplicacao(60, 1000.00F, 8.5F);

		assertEquals(3.14F, aplicacao.getImpostoRenda());
	}

}