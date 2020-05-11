package github.com.alanngeorge1.rest.controller;


import github.com.alanngeorge1.service.PedidoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

private PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }
}
