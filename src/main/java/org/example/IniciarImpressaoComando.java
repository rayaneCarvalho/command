package org.example;

public class IniciarImpressaoComando implements Comando {

    private Impressora3D impressora;

    public IniciarImpressaoComando(Impressora3D impressora) {
        this.impressora = impressora;
    }

    @Override
    public void executar() {
        impressora.iniciarImpressao();
    }

    @Override
    public void cancelar() {
        impressora.cancelarImpressao();
    }
}

