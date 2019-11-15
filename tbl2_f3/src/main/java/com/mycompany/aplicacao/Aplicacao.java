
package com.mycompany.aplicacao;

public class Aplicacao {
    private int dias;
    private float aplicacaoInicial;
    private float juros;
    private float aliquota;

    public Aplicacao(int dias, float aplicacaoInicial, float juros) {
        this.dias = dias;
        this.aplicacaoInicial = aplicacaoInicial;
        this.juros = juros;

        if (dias <= 180) {
            aliquota = 22.5F;
        } else if (dias <= 360) {
            aliquota = 20;
        } else if (dias <= 720) {
            aliquota = 17.5F;
        } else {
            aliquota = 15;
        }
    }

    public float getRendimentoBruto() {
        float rendimentoBruto = (dias / 365.0F) * aplicacaoInicial * (juros / 100);
        return rendimentoBruto;
    }

    public float getImpostoRenda() {
        float impostoRenda = getRendimentoBruto() * (aliquota / 100);
        return impostoRenda;
    }

    public float getRendimentoLiquido() {
        float rendimentoLiquido = ((aplicacaoInicial + getRendimentoBruto() - getImpostoRenda()) / aplicacaoInicial
                * 100);
        return rendimentoLiquido - 100;
    }

}