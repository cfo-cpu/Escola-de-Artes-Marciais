package Entidade;

public class Turma {
	private String horarios;
	private String niveis;
	private int turma;
	
	public Turma(String horarios, String niveis, int turma) {
		this.horarios = horarios;
		this.niveis = niveis;
		this.turma = turma;
	}
	
	public String getHorarios() {
		return horarios;
	}
	
	public void setHorarios(String horarios) {
		this.horarios = horarios;
	}
	
	public  String getNiveis() {
		return niveis;
	}
	
	public void setNiveis(String niveis) {
		this.niveis = niveis;
	}
	
	public int getTurma() {
		return idturma;
	}
	
	public void setTurma(int turma) {
		this.idturma = idturma;
	}

}
