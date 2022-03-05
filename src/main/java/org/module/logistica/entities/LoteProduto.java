package org.module.logistica.entities;

import lombok.Getter;
import lombok.Setter;
import org.module.logistica.entities.enums.UnidadeMedida;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class LoteProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Access(AccessType.PROPERTY)
    private Long id;
    @Access(AccessType.PROPERTY)
    private Double custo;
    @Access(AccessType.PROPERTY)
    private Double quantidade;
    @Access(AccessType.PROPERTY)
    private Double saldo;
    @Access(AccessType.PROPERTY)
    private LocalDate dataFabricacao;
    @Access(AccessType.PROPERTY)
    private LocalDate dataValidade;

    @ManyToOne
    @Access(AccessType.PROPERTY)
    private NotaFiscal notaFiscal;

    @ManyToOne
    @Access(AccessType.PROPERTY)
    private EnderecoEstoque enderecoEstoque;

    @ManyToOne
    @Access(AccessType.PROPERTY)
    private Produto produto;

    @Enumerated(EnumType.STRING)
    @Access(AccessType.PROPERTY)
    private UnidadeMedida unidadeMedida;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public EnderecoEstoque getEnderecoEstoque() {
        return enderecoEstoque;
    }

    public void setEnderecoEstoque(EnderecoEstoque enderecoEstoque) {
        this.enderecoEstoque = enderecoEstoque;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
}
