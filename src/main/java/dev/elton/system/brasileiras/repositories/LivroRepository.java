package dev.elton.brasileiras.system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.elton.brasileiras.system.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
