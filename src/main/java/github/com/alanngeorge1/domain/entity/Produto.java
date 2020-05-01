package github.com.alanngeorge1.domain.entity;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table (name = "produto")
public class Produto {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "precoUnitario")
    private BigDecimal precoUnitario;


    public Produto() {
    }

    public String getDescricaoo() {
        return this.descricao;
    }

    public void setDescricao(String produto) {
        this.descricao = descricao;
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
