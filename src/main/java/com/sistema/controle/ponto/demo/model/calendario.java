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

public class calendario {
    @Id;
    private long id;
    private tipoData tipoData;
    private String descricao;
    private LocalDataTime dataEspecial;

}