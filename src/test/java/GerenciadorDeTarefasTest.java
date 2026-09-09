import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GerenciadorDeTarefasTest {

    private GerenciadorDeTarefas gerenciador;

    @BeforeEach
    void configurar() {
        gerenciador = new GerenciadorDeTarefas();
    }

    @Test
    void deveAdicionarUmaTarefa() {
        gerenciador.adicionarTarefa("Estudar Java");

        assertTrue(gerenciador.verificarTarefa("Estudar Java"));
    }

    @Test
    void deveRemoverUmaTarefaExistente() {
        gerenciador.adicionarTarefa("Estudar Java");

        gerenciador.removerTarefa("Estudar Java");

        assertFalse(gerenciador.verificarTarefa("Estudar Java"));
    }

    @Test
    void naoDeveRemoverUmaTarefaInexistente() {
        gerenciador.adicionarTarefa("Estudar Java");

        gerenciador.removerTarefa("Fazer exercício");

        assertTrue(gerenciador.verificarTarefa("Estudar Java"));
    }

    @Test
    void deveListarTodasAsTarefas() {
        gerenciador.adicionarTarefa("Estudar Java");
        gerenciador.adicionarTarefa("Fazer exercício");

        assertEquals(2, gerenciador.listarTarefas().size());
    }

    @Test
    void deveVerificarSeUmaTarefaExiste() {
        gerenciador.adicionarTarefa("Estudar Java");

        assertTrue(gerenciador.verificarTarefa("Estudar Java"));
        assertFalse(gerenciador.verificarTarefa("Estudar Python"));
    }
}