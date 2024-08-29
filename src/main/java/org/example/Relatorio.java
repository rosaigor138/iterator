package org.example;

import java.util.Iterator;

public class Relatorio {

    public static Integer contarTarefasCompletas(Projeto projeto) {
        int quantidade = 0;
        for (Tarefa tarefa : projeto) {
            if (tarefa.isCompleta()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalTarefas(Projeto projeto) {
        int quantidade = 0;
        for (Iterator<Tarefa> it = projeto.iterator(); it.hasNext(); ) {
            quantidade++;
            it.next();
        }
        return quantidade;
    }
}
