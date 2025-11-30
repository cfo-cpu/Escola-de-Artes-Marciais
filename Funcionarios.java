package Entidade;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionarios {
	protected String matricula;
	protected String CPF;
	protected String nome;
	protected String dataNascimento;
	protected String agencia;
	protected String numeroConta;
	protected int experiencia;
	protected String email;
	protected List<String> telefones;
	
	public Funcionarios (String matricula, String CPF, String nome, String dataNascimento,
			String agencia, String numeroConta, int experiencia, String email, 
			List<String> telefones) {
		this.matricula = matricula;
		this.CPF = CPF;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.experiencia = experiencia;
		this.email = email;
		this.telefones = (telefones != null) ? telefones : new ArrayList<>();
	}
	public String getMatricula(){
		return matricula;
	}
	public String getCPF() {
		return CPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public String getAgencia() {
		return agencia;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<String> telefone) {
		this.telefones = telefone;
	}
	public void adicionarTelefone(String telefone) {
		this.telefones.add(telefone);
	}
	public void removerTelefone(String telefone) {
		this.telefones.remove(telefone);
	}

}
