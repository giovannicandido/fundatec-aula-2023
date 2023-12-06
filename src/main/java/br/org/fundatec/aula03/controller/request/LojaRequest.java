package br.org.fundatec.aula03.controller.request;

import br.org.fundatec.aula03.model.Endereco;
import br.org.fundatec.aula03.model.Loja;

public class LojaRequest {

    private String nome;

    private Integer numeroCarros;

    private EnderecoRequest endereco;

    public Loja toModel() {
       return new Loja(null, nome, numeroCarros, endereco.toModel());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumeroCarros() {
        return numeroCarros;
    }

    public void setNumeroCarros(Integer numeroCarros) {
        this.numeroCarros = numeroCarros;
    }

    public EnderecoRequest getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoRequest endereco) {
        this.endereco = endereco;
    }
}
