package dev.elton.system.brasileiras.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.elton.system.brasileiras.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
