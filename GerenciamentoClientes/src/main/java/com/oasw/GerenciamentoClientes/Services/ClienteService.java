package com.oasw.GerenciamentoClientes.Services;

import com.oasw.GerenciamentoClientes.Models.ClienteModel;
import com.oasw.GerenciamentoClientes.Repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public ClienteModel create(ClienteModel clienteModel){
        return clienteRepository.save(clienteModel);
    }

    public List<ClienteModel> getAll(){
        return clienteRepository.findAll();
    }

    public ClienteModel getById(Long id){
        return clienteRepository.getById(id);
    }

    public void deleteById(Long id){
        clienteRepository.deleteById(id);
    }
}
