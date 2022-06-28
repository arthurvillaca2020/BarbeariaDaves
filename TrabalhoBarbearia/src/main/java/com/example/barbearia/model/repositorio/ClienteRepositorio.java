package com.example.barbearia.model.repositorio;

import com.example.barbearia.model.entidade.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {
}
