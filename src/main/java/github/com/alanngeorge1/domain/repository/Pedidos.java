package github.com.alanngeorge1.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  github.com.alanngeorge1.domain.entity.Cliente;
import github.com.alanngeorge1.domain.entity.Pedido;
import java.util.List;
import java.util.Set;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}