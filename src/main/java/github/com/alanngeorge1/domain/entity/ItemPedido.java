package github.com.alanngeorge1.domain.entity;

public class ItemPedido {

    private Integer id;
    private Pedido pedidoID;
    private Produto produtoId;
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