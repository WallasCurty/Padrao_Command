import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;



public class HospitalTest {
    Hospital hospital;
    Consulta consulta;

    @BeforeEach
    void setUp(){
        hospital = new Hospital();
        consulta = new Consulta(1,"Dipirona");
    }

    @Test
    void devePrepararReceita(){
        Receita prepararReceitaConsulta = new ReceitaConsulta(consulta);
        hospital.executarReceita(prepararReceitaConsulta);

        assertEquals("Receita em aberto",consulta.getSituacao());
    }

    @Test
    void deveEntregarReceita(){
        Receita entregarReceitaConsulta= new EntregaReceita(consulta);
        hospital.executarReceita(entregarReceitaConsulta);

        assertEquals("Receita entregue",consulta.getSituacao());
    }
}
