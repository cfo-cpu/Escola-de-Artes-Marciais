package Entidade;

import java.util.ArrayList;
import java.util.List;

public class Modalidade {

    private String id;
    private String nome;
    private String nivel;
    private String graduacao;
    private List<Turma> turmas;

    public Modalidade(String id, String nome, String nivel, List<Turma> turmas, String graduacao) {
        this.id = id;
        this.nome = nome;
        this.nivel = nivel;
        this.graduacao = graduacao;
        this.turmas = (turmas != null) ? turmas : new ArrayList<>();
    }

    public String getIdModalidade() {
        return idModalidade;
    }

    public String getNome() {
        return nome;
    }
    public String getGraduacao() {
        return graduacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
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
