package org.example;

public class CancelarImpressaoComando implements Comando {

    private Impressora3D impressora;

    public CancelarImpressaoComando(Impressora3D impressora) {
        this.impressora = impressora;
    }

    @Override
    public void executar() {
        impressora.cancelarImpressao();
    }

    @Override
    public void cancelar() {
        impressora.iniciarImpressao();
    }
}
