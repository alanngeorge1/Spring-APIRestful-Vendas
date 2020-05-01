package github.com.alanngeorge1.domain.repository;

import github.com.alanngeorge1.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}