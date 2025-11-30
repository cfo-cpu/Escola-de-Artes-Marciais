import java.util.List;

public class servico_gerais extends funcionarios{
    protected float id_servico_gerais;
    protected String turno;

    public servico_gerais(String matricula, String CPF, String nome, String dataNascimento,
			String agencia, String numeroConta, int experiencia, String email, 
			List<String> telefones, float id_servico_gerais, String turno) {

            this.id_servico_gerais=id_servico_gerais;
            this.turno=turno;	
        
    }

    public float getId_servico_gerais(){
        return id_servico_gerais;
    }
    public String getTurno(){
        return turno;
    }
    public void setId_servico_gerais(float id_servico_gerais){
        this.id_servico_gerais=id_servico_gerais;
    }
    public void setTurno(String turno){
        this.turno=turno;
    }

}
