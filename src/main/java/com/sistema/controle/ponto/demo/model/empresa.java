package com.demo.model;
import lombok.*;
import java.util.objects;

@Getter
@Setter
@AllArgsConstructors
@NoAllArgsConstructors
@EqualsAndHashCode
@Builder
@Entity
@Audited

public class empresa {
    @Id;
    private Long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;

}