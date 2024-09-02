package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PainelDeControleTest {

    private PainelDeControle painel;
    private Impressora3D impressora;

    @BeforeEach
    void setUp() {
        painel = new PainelDeControle();
        impressora = new Impressora3D();
    }

    @Test
    void deveIniciarImpressao() {
        Comando iniciarImpressao = new IniciarImpressaoComando(impressora);
        painel.definirComando(iniciarImpressao);

        assertEquals(true, impressora.isImprimindo()); // Certifica-se de que a impressora está imprimindo
    }

    @Test
    void devePausarImpressao() {
        Comando iniciarImpressao = new IniciarImpressaoComando(impressora);
        Comando pausarImpressao = new PausarImpressaoComando(impressora);

        painel.definirComando(iniciarImpressao); // Inicia a impressão
        painel.definirComando(pausarImpressao); // Pausa a impressão

        assertEquals(false, impressora.isImprimindo()); // Certifica-se de que a impressora está pausada
    }

    @Test
    void deveCancelarImpressao() {
        Comando iniciarImpressao = new IniciarImpressaoComando(impressora);
        Comando cancelarImpressao = new CancelarImpressaoComando(impressora);

        painel.definirComando(iniciarImpressao); // Inicia a impressão
        painel.definirComando(cancelarImpressao); // Cancela a impressão

        assertEquals(false, impressora.isImprimindo()); // Certifica-se de que a impressão foi cancelada
    }

    @Test
    void deveAjustarTemperaturaBico() {
        Comando ajustarTemperatura = new AjustarTemperaturaBicoComando(impressora, 210);

        painel.definirComando(ajustarTemperatura);

        assertEquals(210, impressora.obterTemperaturaBico()); // Certifica-se de que a temperatura foi ajustada corretamente
    }

    @Test
    void deveDesfazerAjusteTemperaturaBico() {
        Comando ajustarTemperatura = new AjustarTemperaturaBicoComando(impressora, 210);

        painel.definirComando(ajustarTemperatura);
        painel.desfazerUltimaAcao(); // Desfaz o ajuste da temperatura

        assertEquals(0, impressora.obterTemperaturaBico()); // Supondo que a temperatura inicial era 0, verifica se a temperatura foi restaurada
    }
}
