package com.oasw.GerenciamentoClientes.Repositories;

import com.oasw.GerenciamentoClientes.Models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel,Long> {
}
