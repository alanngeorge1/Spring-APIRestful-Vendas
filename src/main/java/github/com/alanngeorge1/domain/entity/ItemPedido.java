package github.com.alanngeorge1.domain.entity;



import javax.persistence.*;

@Entity
@Table(name ="Item_Pedido")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Id")
    private Integer id;

    @ManyToOne
    @JoinColumn (name = "pedido_id")
    private Pedido pedidoID;

    @ManyToOne
    @JoinColumn(name = "produto_id")
    private Produto produtoId;

    @Column
    private Integer quantidade;

    public ItemPedido() {
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pedido getPedidoID() {
        return this.pedidoID;
    }

    public void setPedidoID(Pedido pedidoID) {
        this.pedidoID = pedidoID;
    }

    public Produto getProdutoId() {
        return this.produtoId;
    }

    public void setProdutoId(Produto produtoId) {
        this.produtoId = produtoId;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}