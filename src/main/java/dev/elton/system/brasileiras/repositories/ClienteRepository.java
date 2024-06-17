package dev.elton.system.brasileiras.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.elton.system.brasileiras.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
