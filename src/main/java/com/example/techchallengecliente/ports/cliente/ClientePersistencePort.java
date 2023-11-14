package com.example.techchallengecliente.ports.cliente;



import com.example.techchallengecliente.domain.cliente.Cliente;

import java.util.List;

public interface ClientePersistencePort {

    Cliente save(Cliente cliente);
    List<Cliente> findAll();
    Cliente findByNome(String nome);
    Cliente findByCpf(String cpf);

}
