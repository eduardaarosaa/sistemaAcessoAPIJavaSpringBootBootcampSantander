package com.demo.model;
import lombok.*;
import java.util.objects;

@Getter
@Setter
@AllArgsConstructors
@NoAllArgsConstructors
@EqualsAndHashCode
@Builder
@Audited

public class ocorrencia(){
    private long id;
    private String nome;
    private String descricao;
}
