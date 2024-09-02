package org.example;

import java.util.ArrayList;
import java.util.List;

public class PainelDeControle {

    private List<Comando> comandosExecutados = new ArrayList<>();
    private Comando comandoUndo;

    public void definirComando(Comando comando) {
        comando.executar();
        comandosExecutados.add(comando);
        comandoUndo = comando;
    }

    public void cancelarUltimoComando() {
        if (!comandosExecutados.isEmpty()) {
            Comando ultimoComando = comandosExecutados.get(comandosExecutados.size() - 1);
            ultimoComando.cancelar();
            comandosExecutados.remove(comandosExecutados.size() - 1);
        }
    }

    public void desfazerUltimaAcao() {
        if (comandoUndo != null) {
            comandoUndo.cancelar();
        }
    }
}

