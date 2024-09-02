package org.example;

public class AjustarTemperaturaBicoComando implements Comando {

    private Impressora3D impressora;
    private int temperatura;
    private int temperaturaAnterior;

    public AjustarTemperaturaBicoComando(Impressora3D impressora, int temperatura) {
        this.impressora = impressora;
        this.temperatura = temperatura;
    }

    @Override
    public void executar() {
        temperaturaAnterior = impressora.obterTemperaturaBico(); // Salvar temperatura anterior
        impressora.ajustarTemperaturaBico(temperatura);
    }

    @Override
    public void cancelar() {
        impressora.ajustarTemperaturaBico(temperaturaAnterior);
    }
}

