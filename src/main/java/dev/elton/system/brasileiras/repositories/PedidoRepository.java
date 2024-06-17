package dev.elton.system.brasileiras.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.elton.system.brasileiras.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
