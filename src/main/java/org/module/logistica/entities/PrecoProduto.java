package org.module.logistica.entities;


import lombok.Getter;
import lombok.Setter;
import org.module.logistica.entities.enums.UnidadeMedida;

import javax.persistence.*;

@Entity
public class PrecoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Access(AccessType.PROPERTY)
    private Long id;
    @Access(AccessType.PROPERTY)
    private Double preco;
    @Access(AccessType.PROPERTY)
    private int padrao;

    @Enumerated(EnumType.STRING)
    @Access(AccessType.PROPERTY)
    private UnidadeMedida unidadeMedida;

    @ManyToOne
    @Access(AccessType.PROPERTY)
    private Produto produto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getPadrao() {
        return padrao;
    }

    public void setPadrao(int padrao) {
        this.padrao = padrao;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
