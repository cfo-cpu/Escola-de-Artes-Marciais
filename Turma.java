package Aluno1;

public class Turma {
	private String horarios;
	private String niveis;
	private int  idturma;
	
	public Turma(String horarios, String niveis, int idturma) {
		this.horarios = horarios;
		this.niveis = niveis;
		this.idturma = idturma;
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
	
	public int getIdturma() {
		return idturma;
	}
	
	public void setIdturma(int idturma) {
		this.idturma = idturma;
	}

}
