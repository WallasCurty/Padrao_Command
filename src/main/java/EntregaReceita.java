

public class EntregaReceita implements Receita {
    private Consulta consulta;

    public EntregaReceita(Consulta consulta){
        this.consulta = consulta;
    }
    @Override
    public void executar(){
        this.consulta.entregarReceitaConsulta();
    }

}
