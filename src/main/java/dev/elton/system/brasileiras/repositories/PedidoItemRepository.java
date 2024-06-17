package dev.elton.brasileiras.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.elton.brasileiras.system.entities.PedidoItem;

public interface PedidoItemRepository extends JpaRepository<PedidoItem, Long> {

}
