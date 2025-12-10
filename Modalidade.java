package Entidade;

import java.util.ArrayList;
import java.util.List;

public class Modalidade {

    private String id;
    private String nome;
    private String nivel;
    private String graduacao;

    public Modalidade(String id, String nome, String nivel, String graduacao) {
        this.id = id;
        this.nome = nome;
        this.nivel = nivel;
        this.graduacao = graduacao;
    }

    public String getId() {
        return id;
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

}
