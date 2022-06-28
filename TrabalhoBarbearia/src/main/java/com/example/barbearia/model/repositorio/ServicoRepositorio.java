package com.example.barbearia.model.repositorio;

import com.example.barbearia.model.entidade.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepositorio extends JpaRepository<Servico, Long> {
}
