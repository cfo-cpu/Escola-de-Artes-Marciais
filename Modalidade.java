package Entidade;

import java.util.ArrayList;
import java.util.List;

public class Modalidade {

    private String idModalidade;
    private String nome;
    private String nivel;
    private List<Turma> turmas;

    public Modalidade(String idModalidade, String nome, String nivel, List<Turma> turmas) {
        this.idModalidade = idModalidade;
        this.nome = nome;
        this.nivel = nivel;
        this.turmas = (turmas != null) ? turmas : new ArrayList<>();
    }

    public String getIdModalidade() {
        return idModalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void adicionarTurma(Turma turma) {
        if (turma != null) turmas.add(turma);
    }

    public void removerTurma(Turma turma) {
        if (turma != null) turmas.remove(turma);
    }
}
