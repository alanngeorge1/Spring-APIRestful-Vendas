package github.com.alanngeorge1.domain.entity;

import java.math.BigDecimal;

public class Produto {
    private String produto;
    private Integer id;
    private BigDecimal precoUnitario;

    public Produto() {
    }

    public String getProduto() {
        return this.produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getPrecoUnitario() {
        return this.precoUnitario;
    }

    public void setPrecoUnitario(BigDecimal precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
