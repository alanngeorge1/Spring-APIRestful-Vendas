package github.com.alanngeorge1.domain.repository;

import github.com.alanngeorge1.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer>{
}
