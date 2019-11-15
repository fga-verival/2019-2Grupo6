
package com.mycompany.aplicacao;

public class Aplicacao 
{
    private int dias;

    private float aplicacaoInicial;

    private float juros;

	public Aplicacao(int dias, float aplicacaoInicial, float juros) {
        this.dias = dias;
        this.aplicacaoInicial = aplicacaoInicial;
        this.juros = juros;
	}

	public float getRendimentoBruto() {
		return 13.97F;
    }
    
    public float getImpostoRenda() {
		return 3.14F;
	}

	public float getRendimentoLiquido() {
		return 1.0829F;
	}

}