public class Consulta {
    private int nPaciente;
    private String nomeRemedio;
    private String situacao;

    public Consulta(int nPaciente, String nomeRemedio){
        this.nPaciente = nPaciente;
        this.nomeRemedio = nomeRemedio;
    }

    public String getSituacao(){
        return situacao;

    }

    public void prepararReceitaConsulta(){
        this.situacao = "Receita em aberto";
    }

    public void entregarReceitaConsulta(){
        this.situacao = "Receita entregue";
    }
}
