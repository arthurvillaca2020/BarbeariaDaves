package com.example.barbearia.model.repositorio;

import com.example.barbearia.model.entidade.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepositorio extends JpaRepository<Agenda, Long> {
}
