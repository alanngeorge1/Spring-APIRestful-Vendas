package github.com.alanngeorge1.rest.controller;


import github.com.alanngeorge1.domain.entity.Pedido;
import github.com.alanngeorge1.rest.dto.PedidoDTO;
import github.com.alanngeorge1.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

private PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Integer save (@RequestBody PedidoDTO dto){
        Pedido pedido = service.salvar(dto);
        return pedido.getId();


    }

}
