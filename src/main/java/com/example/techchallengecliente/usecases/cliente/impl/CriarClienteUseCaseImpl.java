package com.example.techchallengecliente.usecases.cliente.impl;


import com.example.techchallengecliente.domain.cliente.Cliente;
import com.example.techchallengecliente.ports.cliente.ClientePersistencePort;
import com.example.techchallengecliente.usecases.cliente.CriarClienteUseCase;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CriarClienteUseCaseImpl implements CriarClienteUseCase {

  private final ClientePersistencePort clientePersistencePort;

  @Override
  public Cliente save(Cliente cliente) {
    return clientePersistencePort.save(cliente);
  }
}
