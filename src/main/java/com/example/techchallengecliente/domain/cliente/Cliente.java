package com.example.techchallengecliente.domain.cliente;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;
    private String email;

}
