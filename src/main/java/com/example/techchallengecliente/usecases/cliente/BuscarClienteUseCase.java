package com.example.techchallengecliente.usecases.cliente;



import com.example.techchallengecliente.domain.cliente.Cliente;

import java.util.List;

public interface BuscarClienteUseCase {
  List<Cliente> findAll();
  Cliente findByCpf(String cpf);
  Cliente findByNome(String nome);
}
