package com.demo.model;
import lombok.*;
import java.util.objects;
import java.persistence.embeddable;
import java.persistence.embeddableId;
import java.io.serializable;
import java.math.BigDecimal;


@Getter
@Setter
@AllArgsConstructors
@NoAllArgsConstructors
@EqualsAndHashCode
@Builder
@Entity
@Audited

public class bancoHoras {

    @AllArgsConstructors
    @NoAllArgsConstructors
    @EqualsAndHashCode
    @Embeddable

    public class bancoHorasID implements Serializable{

        private long idBancoHoras;
        private long idMovimentacao;
        private long idUsuario;

    }
    @Id;
    @EmbeddableId
    private BancoHorasId id;
    private LocalDataTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;


}