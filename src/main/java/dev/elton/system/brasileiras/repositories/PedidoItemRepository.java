package dev.elton.system.brasileiras.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.elton.system.brasileiras.entities.PedidoItem;

public interface PedidoItemRepository extends JpaRepository<PedidoItem, Long> {

}
