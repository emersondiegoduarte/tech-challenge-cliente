package com.example.techchallengecliente.usecases.cliente;


import com.example.techchallengecliente.domain.cliente.Cliente;

public interface CriarClienteUseCase {
  Cliente save(Cliente cliente);
}
