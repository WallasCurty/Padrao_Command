public class ReceitaConsulta  implements Receita{
    private Consulta consulta;

    public ReceitaConsulta(Consulta consulta){
        this.consulta = consulta;
    }
    @Override
    public void executar(){
        this.consulta.prepararReceitaConsulta();
    }
}
