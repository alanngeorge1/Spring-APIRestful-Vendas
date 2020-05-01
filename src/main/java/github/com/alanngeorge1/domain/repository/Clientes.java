package github.com.alanngeorge1.domain.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import github.com.alanngeorge1.domain.entity.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface Clientes extends JpaRepository<Cliente, Integer> {
    @Query (value = "select c from Cliente c where c.nome like :nome")
    List<Cliente> encontrarPorNome(@Param("nome") String nome);
    boolean existsByNome(String nome);
}