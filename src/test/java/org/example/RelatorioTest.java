package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelatorioTest {

    @Test
    void deveContarTarefasCompletasProjeto() {
        Projeto projeto = new Projeto(
                new Tarefa("Desenvolver funcionalidades", true),
                new Tarefa("Escrever documentação", true),
                new Tarefa("Corrigir bugs", false),
                new Tarefa("Realizar testes", true)
        );
        assertEquals(3, Relatorio.contarTarefasCompletas(projeto));
    }

    @Test
    void deveContarTotalTarefasProjeto() {
        Projeto projeto = new Projeto(
                new Tarefa("Desenvolver funcionalidades", true),
                new Tarefa("Escrever documentação", true),
                new Tarefa("Corrigir bugs", false),
                new Tarefa("Realizar testes", true)
        );
        assertEquals(4, Relatorio.contarTotalTarefas(projeto));
    }
}
