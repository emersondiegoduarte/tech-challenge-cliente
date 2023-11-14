package com.example.techchallengecliente.config;


import com.example.techchallengecliente.TechChallengeClienteApplication;
import com.example.techchallengecliente.ports.cliente.ClientePersistencePort;
import com.example.techchallengecliente.usecases.cliente.BuscarClienteUseCase;
import com.example.techchallengecliente.usecases.cliente.CriarClienteUseCase;
import com.example.techchallengecliente.usecases.cliente.impl.BuscarClienteUseCaseImpl;
import com.example.techchallengecliente.usecases.cliente.impl.CriarClienteUseCaseImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = TechChallengeClienteApplication.class)
public class BeanConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public CriarClienteUseCase criarClienteUseCase(ClientePersistencePort persistence) {
        return new CriarClienteUseCaseImpl(persistence);
    }

    @Bean
    public BuscarClienteUseCase buscarClienteUseCase(ClientePersistencePort persistence) {
        return new BuscarClienteUseCaseImpl(persistence);
    }



}
