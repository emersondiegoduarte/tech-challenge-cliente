package com.example.techchallengecliente.ports.cliente;

import com.example.techchallengecliente.domain.cliente.Cliente;
import com.example.techchallengecliente.repository.cliente.ClienteJpaRepository;
import com.example.techchallengecliente.repository.entities.ClienteEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;


@RequiredArgsConstructor
@Component
public class ClientePersistencePortImpl implements ClientePersistencePort {

    private final ClienteJpaRepository clienteJpaRepository;
    private final ModelMapper modelMapper;

    @Override
    public Cliente save(Cliente cliente) {
        ClienteEntity clienteEntity = clienteJpaRepository.save(modelMapper.map(cliente, ClienteEntity.class));
        return modelMapper.map(clienteEntity, Cliente.class);
    }

    @Override
    public List<Cliente> findAll() {
        return clienteJpaRepository.findAll().stream().map(entity -> modelMapper.map(entity, Cliente.class)).toList();
    }

    @Override
    public Cliente findByNome(String nome) {
        ClienteEntity cliente = clienteJpaRepository.findByCpf(nome);
        if(cliente != null ){
            return modelMapper.map(cliente, Cliente.class);
        }
        return null;
    }

    @Override
    public Cliente findByCpf(String cpf) {
        ClienteEntity cliente = clienteJpaRepository.findByCpf(cpf);
        if(cliente != null){
            return modelMapper.map(cliente, Cliente.class);
        }
        return null;
    }
}
