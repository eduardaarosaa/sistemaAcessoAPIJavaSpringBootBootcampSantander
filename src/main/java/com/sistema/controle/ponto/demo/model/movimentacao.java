package com.demo.model;
import lombok.*;
import java.util.objects;
import java.persistence.embeddable;
import java.persistence.embeddableId;
import java.io.serializable;

@Getter
@Setter
@AllArgsConstructors
@NoAllArgsConstructors
@EqualsAndHashCode
@Builder
@Entity
@Audited

public class movimentacao(){
    @AllArgsConstructors
    @NoAllArgsConstructors
    @EqualsAndHashCode
    @Embeddable
    public class movimentacaoId() implements Serializable{
        private long idMovimento;
        private long idUsuario;

    }
    @Id;
    @EmbeddableId
    private movimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    private ocorrencia ocorrencia;
    private calendario calendario;
}