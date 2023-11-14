package com.example.techchallengecliente.usecases.cliente.impl;


import com.example.techchallengecliente.domain.cliente.Cliente;
import com.example.techchallengecliente.ports.cliente.ClientePersistencePort;
import com.example.techchallengecliente.usecases.cliente.BuscarClienteUseCase;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class BuscarClienteUseCaseImpl implements BuscarClienteUseCase {
  private final ClientePersistencePort clientePersistencePort;

  @Override
  public List<Cliente> findAll() {
    return clientePersistencePort.findAll();
  }

  @Override
  public Cliente findByCpf(String cpf) {
    return clientePersistencePort.findByCpf(cpf);
  }

  @Override
  public Cliente findByNome(String nome) {
    return clientePersistencePort.findByNome(nome);
  }
}
