package dev.elton.brasileiras.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.elton.brasileiras.system.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
