import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Receita> receitas = new ArrayList<Receita>();


    public void executarReceita(Receita receita) {
        this.receitas.add(receita);
        receita.executar();
    }
}
