package com.douginfodev.literalura.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "autores")
public class Autor {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private Integer anonascimento;

    private Integer anofalecimento;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor(){}

    public Autor(Integer autorid, String autor, Integer dtnascimento, Integer dtfalecimento) {
        this.id = autorid;
        this.nome = autor;
        this.anonascimento = dtnascimento;
        this.anofalecimento = dtfalecimento;
    }

    public Integer getanoNascimento() {
        return anonascimento;
    }

    public void setanoNascimento(Integer ano) {
        this.anonascimento = ano;
    }

    public Integer getanoFalecimento() {
        return anofalecimento;
    }

    public void setanoFalecimento(Integer ano) {
        this.anofalecimento = ano;
    }

    @Override
    public String toString() {
        return  "ID: " + this.id + "\n"+
                "NOME: " + this.nome + "\n"+
                "DATA NASCIMENTO: " +  this.anonascimento + "\n"+
                "DATA FALECIMENTO: " + this.anofalecimento + "\n"+
                "----------------------------------"+"\n";
    }
}
