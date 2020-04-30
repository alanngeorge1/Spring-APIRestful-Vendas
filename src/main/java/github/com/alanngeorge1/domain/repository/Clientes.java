package github.com.alanngeorge1.domain.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import github.com.alanngeorge1.domain.entity.Cliente;


public interface Clientes extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNomeLike(String nome);

    boolean existsByNome(String nome);
}