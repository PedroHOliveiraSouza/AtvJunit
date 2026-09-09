import java.util.ArrayList;
import java.util.List;
public class GerenciadorDeTarefas {

    public List<String> tarefas;

    public GerenciadorDeTarefas(){
        tarefas = new ArrayList<>();
    }
    public void adicionarTarefa(String tarefa){
        tarefas.add(tarefa);
    }
    public void removerTarefa(String tarefa){
        tarefas.remove(tarefa);
    }
    public boolean verificarTarefa(String tarefa){
        return tarefas.contains(tarefa);
    }
    public List<String> listarTarefas(){
        return tarefas;
    }
}
