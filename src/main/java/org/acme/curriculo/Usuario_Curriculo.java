package org.acme.curriculo;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Cacheable
public class Usuario_Curriculoextends PanacheEntity {

    @Column(length = 60)
    private String nome;
    @Column(length = 60)
    private String email;
    @Column(length = 11)
    private String telefone;


    @OneToMany
    private List<Formacao> formacoes = new ArrayList<>();

    @OneToMany
    private List<Experiencia> experiencias = new ArrayList<>();

    @Deprecated
    public Usuario_Curriculo(){}

    public Usuario_Curriculo(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public List<Formacao> getFormacoes() {
        return formacoes;
    }

    public List<Experiencia> getExperiencias() {
        return experiencias;
    }

    public void addFormacoes(Formacao formacao) {
        this.formacoes.add(formacao);
    }

    public void addExperiencias(Experiencia experiencia) {
        this.experiencias.add(experiencia);
    }
}
