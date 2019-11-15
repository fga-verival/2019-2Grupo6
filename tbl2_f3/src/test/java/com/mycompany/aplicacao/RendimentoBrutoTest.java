package com.mycompany.aplicacao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RendimentoBrutoTest {

	@Test
	void test() {
		Aplicacao aplicacao = new Aplicacao(60, 1000.00F, 8.5F);

		assertEquals(13.97F, aplicacao.getRendimentoBruto());
	}

}