package org.example;
public class Impressora3D {

    private int temperaturaBico = 0;
    private boolean imprimindo = false;

    public void iniciarImpressao() {
        imprimindo = true;
        System.out.println("Impressora 3D iniciando impressão.");
    }

    public void pausarImpressao() {
        if (imprimindo) {
            imprimindo = false;
            System.out.println("Impressora 3D pausada.");
        }
    }

    public void cancelarImpressao() {
        if (imprimindo) {
            imprimindo = false;
            System.out.println("Impressora 3D cancelada.");
        }
    }

    public void ajustarTemperaturaBico(int temperatura) {
        temperaturaBico = temperatura;
        System.out.println("Temperatura do bico da impressora ajustada para " + temperatura + "°C.");
    }

    public int obterTemperaturaBico() {
        return temperaturaBico;
    }

    public boolean isImprimindo() {
        return imprimindo;
    }
}
