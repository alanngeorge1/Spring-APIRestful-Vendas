package github.com.alanngeorge1.exception;

public class PedidoNaoEncontradoException extends RuntimeException {
    public  PedidoNaoEncontradoException(){
    super ("Pedido não encontrado.");
    }
}
