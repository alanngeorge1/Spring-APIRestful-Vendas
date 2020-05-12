package github.com.alanngeorge1.service;


import github.com.alanngeorge1.domain.entity.Pedido;
import github.com.alanngeorge1.rest.dto.PedidoDTO;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);

}
