package github.com.alanngeorge1.domain.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(
        name = "cliente"
)
public class Cliente {
    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(
            name = "id"
    )
    private Integer id;
    @Column(
            name = "nome",
            length = 100
    )
    private String nome;

    @OneToMany(mappedBy = "cliente")
    private Set<Pedido> pedidos;

    public Cliente(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public Integer getId() {
        return this.id;
    }

    public String toString() {
        return "Cliente{id=" + this.id + ", nome='" + this.nome + '\'' + '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
