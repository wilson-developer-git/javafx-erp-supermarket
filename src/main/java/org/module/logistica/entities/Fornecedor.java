package org.module.logistica.entities;

import lombok.Getter;
import lombok.Setter;
import org.module.recursos_humanos.entities.enums.TipoPessoa;

import javax.persistence.*;

@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Access(AccessType.PROPERTY)
    private Long id;
    @Access(AccessType.PROPERTY)
    private String nome;
    @Access(AccessType.PROPERTY)
    private String cpfCnpj;
    @Access(AccessType.PROPERTY)
    private String celular;
    @Access(AccessType.PROPERTY)
    private String logradouro;
    @Access(AccessType.PROPERTY)
    private String bairro;
    @Access(AccessType.PROPERTY)
    private String cidade;

    @Enumerated(EnumType.STRING)
    @Access(AccessType.PROPERTY)
    private TipoPessoa tipoPessoa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
