import java.util.List;

public class servico_gerais extends funcionarios{
    protected float id;
    protected String turno;

    public servico_gerais(String matricula, String CPF, String nome, String dataNascimento,
			String agencia, String numeroConta, int experiencia, String email, 
			List<String> telefones, float id, String turno) {
			super(matricula, CPF, nome, dataNascimento, agencia, numeroConta, experiencias, email, telefones);

            this.id=id;
            this.turno=turno;	
        
    }

    public float getId(){
        return id;
    }
    public String getTurno(){
        return turno;
    }
    public void setId(float id){
        this.id=id;
    }
    public void setTurno(String turno){
        this.turno=turno;
    }

}
