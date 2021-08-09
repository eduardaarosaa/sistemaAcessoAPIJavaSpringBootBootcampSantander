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

public class categoriaUsuario
{
   @Id;
    private long id;
    private String descricao;

}