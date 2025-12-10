import java.util.List;

public class recpcionista extends funcionarios{
    protected float id;
    protected String turno;

    public recpcionista(String matricula, String CPF, String nome, String dataNascimento,
			String agencia, String numeroConta, int experiencia, String email, 
			List<String> telefones, float id, String turno) {
            super(matricula, CPF, nome, dataNascimento, agencia, numeroConta, experiencia, email, telefones);

            this.id=id;
            this.turno=turno;	
        
    }
    public Float getId(){
        return id;
    }
    public String getTurno(){
        return turno;
    }
    public void setId(Float id){
        this.id=id;
    }
    public void setTurno(String turno){
        this.turno=turno;
    }

    public void cadastrarAluno(String nome, String cpf, float matricula, float peso, String email, float telefone, String graduação, float dataNascimento) {
        Aluno aluno = new Aluno(nome, cpf, matricula, peso, email, telefone, graduação, dataNascimento);
        Alunos.adicionar(aluno);
    }


    }
