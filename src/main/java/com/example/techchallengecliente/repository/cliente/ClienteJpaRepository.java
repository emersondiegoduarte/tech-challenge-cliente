package com.example.techchallengecliente.repository.cliente;


import com.example.techchallengecliente.repository.entities.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ClienteJpaRepository extends JpaRepository<ClienteEntity, Long> {

    ClienteEntity findByCpf(final String cpf);

}
