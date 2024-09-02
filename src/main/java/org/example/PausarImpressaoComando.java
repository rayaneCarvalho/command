package org.example;

public class PausarImpressaoComando implements Comando {

    private Impressora3D impressora;

    public PausarImpressaoComando(Impressora3D impressora) {
        this.impressora = impressora;
    }

    @Override
    public void executar() {
        impressora.pausarImpressao();
    }

    @Override
    public void cancelar() {
        impressora.iniciarImpressao();
    }
}

