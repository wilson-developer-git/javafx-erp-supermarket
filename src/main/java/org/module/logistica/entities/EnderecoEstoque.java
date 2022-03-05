package org.module.logistica.entities;


import lombok.Getter;
import lombok.Setter;
import org.module.logistica.entities.enums.CentroCusto;

import javax.persistence.*;

@Entity
public class EnderecoEstoque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Access(AccessType.PROPERTY)
    private Long id;
    @Access(AccessType.PROPERTY)
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Access(AccessType.PROPERTY)
    private CentroCusto centroCusto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CentroCusto getCentroCusto() {
        return centroCusto;
    }

    public void setCentroCusto(CentroCusto centroCusto) {
        this.centroCusto = centroCusto;
    }
}
