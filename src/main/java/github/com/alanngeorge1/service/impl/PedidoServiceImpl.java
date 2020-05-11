package github.com.alanngeorge1.service.impl;


import github.com.alanngeorge1.domain.repository.Pedidos;
import github.com.alanngeorge1.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {
    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }








}
