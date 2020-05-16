package github.com.alanngeorge1.service;


import github.com.alanngeorge1.domain.entity.Pedido;
import github.com.alanngeorge1.domain.enums.StatusPedido;
import github.com.alanngeorge1.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {

    Pedido salvar(PedidoDTO dto);

     Optional <Pedido> obterPedidoCompleto (Integer id);
     void atualizaStatus(Integer id, StatusPedido statusPedido);
}
