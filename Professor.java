package Entidade;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionarios {
	protected String id;
	protected String graduacao;
	protected String especialidade;
	protected String cargaHoraria;
	protected List<Turma> turmas;
	
	public Professor (String matricula, String CPF, String nome, String dataNascimento,
			String agencia, String numeroConta, int experiencia, String email, 
			List<String> telefones, String id, String graduacao, 
			String especialidade, String cargaHoraria, List<Turma> turmas) {
		super(matricula, CPF, nome,  dataNascimento, agencia, numeroConta,
				experiencia, email, telefones);
		this.id = id;
		this.graduacao = graduacao;
		this.especialidade = especialidade;
		this.cargaHoraria = cargaHoraria;
		this.turmas = (turma != null) ? turma : new ArrayList<>();
	}
	public String getId() {
		return id;
	}
	public String getGraduacao() {
		return graduacao;
	}
	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public List<Turma> getTurmas(){
		return turmas;
	}
	public void adicionarTurma(Turma turma) {
		if (turma != null) {
		turmas.add(turma);
		}
	}
	public void removerTurma(Turma turma) {
		if (turma != null) {
		turmas.remove(turma);
		}
	}

}

